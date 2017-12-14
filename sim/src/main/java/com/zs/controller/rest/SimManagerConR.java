package com.zs.controller.rest;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.zs.entity.SimManager;
import com.zs.entity.other.EasyUIAccept;
import com.zs.entity.other.EasyUIPage;
import com.zs.entity.other.Result;
import com.zs.service.SimManagerSer;
import com.zs.tools.ExcelImport;

@RestController
@RequestMapping("/api/simManager")
public class SimManagerConR extends BaseRestController<SimManager, BigDecimal>{

	@Resource
	private SimManagerSer simManager;
	
	@RequestMapping(value="",method=RequestMethod.GET)
	@Override
	public Result<EasyUIPage> doQuery(String uid,String data, HttpServletRequest req, HttpServletResponse resp) {
		try {
			EasyUIAccept accept = new Gson().fromJson(data, EasyUIAccept.class);
//			System.out.println("进入"+accept);
			return new Result<EasyUIPage>(SUCCESS,Code.SUCCESS,simManager.queryFenye(accept));
		} catch (Exception e) {
			e.printStackTrace();
			return new Result<EasyUIPage>(ERROR,Code.ERROR,null);
		}
	}

	@Override
	public Result<SimManager> doGet(String uid,String data, HttpServletRequest req, HttpServletResponse resp) {
		BigDecimal id=null;
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value="",method=RequestMethod.PUT)
	@Override
	public Result<String> doAdd(String uid,String data,HttpServletRequest req, HttpServletResponse resp) {
//		System.out.println("测试data"+data);
		SimManager obj = new Gson().fromJson(data, SimManager.class);  
//		System.out.println("进入新增。。。111111");
//		System.out.println(new Gson().toJson(obj));
		if(obj!=null){
			if(obj.getPhone()!=null&&!obj.getPhone().equals("")&&obj.getSimNumber()!=null&&!obj.getSimNumber().equals("")){
				try {
					if(uid!=null&&!uid.equals("")){
						obj.setCreateMan(uid);
					}
					return new Result<String>(SUCCESS,1,simManager.add(obj)) ;
				} catch (Exception e) {
					e.printStackTrace();
					return new Result<String>(ERROR,-1,"添加失败") ;
				}
			}else{
				new Result<String>(ERROR,-1,"缺少电话号码或者sim卡号") ;
			}
		}
		return new Result<String>(ERROR,-1,"所有信息为空") ;
	}

	@RequestMapping(value="",method=RequestMethod.POST)
	@Override
	public Result<String> doUpdate(String uid,String data, HttpServletRequest req, HttpServletResponse resp) {
		try {
			data=URLDecoder.decode(data,"utf-8");
		} catch (Exception e) {
			return new Result<String>(ERROR,-1,"编码错误") ;
		}
		SimManager obj = new Gson().fromJson(data, SimManager.class);  
//		System.out.println("进入修改");
		if(obj!=null){
//			System.out.println(obj.getId()+"----"+obj.getStano()+"-----"+obj.getPhone());
			try {
				if(uid!=null&&!uid.equals("")){
					obj.setCreateMan(uid);
				}
				return new Result<String>(SUCCESS,1,simManager.update(obj)) ;
			} catch (Exception e) {
				return new Result<String>(ERROR,-1,"所有信息为空") ;
			}
		}
		return new Result<String>(ERROR,-1,"所有信息为空") ;
	}
	
	@RequestMapping(value="/state",method=RequestMethod.POST)
	public Result<String> updateState(String uid,String data,HttpServletRequest req, HttpServletResponse resp){
		try {
			SimManager obj = new Gson().fromJson(data, SimManager.class);  
			if(obj!=null){
				BigDecimal id = obj.getId();
				if(id!=null){
					return new Result<String>(SUCCESS,1,simManager.updateState(id)) ;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Result<String>(ERROR,-1,"此条数据注销失败") ;
		}
		return new Result<String>(ERROR,-1,"ID不能为空") ; 
	}
	
	@Override
	public Result<String> doDeleteFalse(String uid,String data, HttpServletRequest req, HttpServletResponse resp) {
		BigDecimal id=null;
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value="",method=RequestMethod.DELETE)
	@Override
	public Result<String> doDeleteTrue(String uid,String data, HttpServletRequest req, HttpServletResponse resp) {
		try {
			SimManager obj = new Gson().fromJson(data, SimManager.class);  
			BigDecimal id = obj.getId();
//			System.out.println("进入删除"+id);
			if(id!=null){
					return new Result<String>(SUCCESS,1,simManager.delete(id)) ;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Result<String>(ERROR,1,"删除失败") ;
		}
		return new Result<String>(ERROR,1,"没有ID") ;
	}

	@Override
	public Result<String> excelExport(String uid,String data, HttpServletRequest req, HttpServletResponse resp) {
		EasyUIAccept accept = new Gson().fromJson(data, EasyUIAccept.class);
		return null;
	}

	@RequestMapping(value="/import",method=RequestMethod.POST)
	@Override
	public Result<String> excelImport(String uid,String data, HttpServletRequest req, HttpServletResponse resp) {
		String s ="";
		String filename =data.substring(data.lastIndexOf("\\"));
		try {
			File file = new File(data);
			InputStream ins = new FileInputStream(file);
			List<String[]> list = ExcelImport.getDataFromExcel2(filename, ins);
			s=simManager.importData(list,uid);
			return new Result<String>(SUCCESS,  Code.SUCCESS, s);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result<String>(ERROR,  Code.ERROR, "数据导入失败，请检查数据格式后重新导入");
		} 
	}

	@RequestMapping(value="/exportExcel",method=RequestMethod.GET)
	public Result<String> excelExport1(String uid,String data, HttpServletRequest req, HttpServletResponse resp) {
		EasyUIAccept accept = new Gson().fromJson(data, EasyUIAccept.class);
//		System.out.println("1111daochu"+accept);
		String s ="";
		try {
			s =simManager.ExportData(accept,req,resp);
			System.out.println("结果集"+s);
			return new Result<String>(SUCCESS,  Code.SUCCESS,s);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result<String>(ERROR,  Code.ERROR,"数据装载失败");
		}
	}
}
