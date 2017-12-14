package com.zs.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.zs.dao.SimManagerMapper;
import com.zs.entity.SimManager;
import com.zs.entity.SimManagerExample;
import com.zs.entity.other.EasyUIAccept;
import com.zs.entity.other.EasyUIPage;
import com.zs.service.SimManagerSer;
import com.zs.tools.ExcelExport;

@Service("simManager")
public class SimManagerSerImpl implements SimManagerSer{

	@Resource
	private SimManagerMapper simManagerMapper;
	
	public EasyUIPage queryFenye(EasyUIAccept accept) {
		if (accept!=null) {
			Integer page=accept.getPage();
			Integer size=accept.getRows();
			if(accept.getInt1()!=null){
				if(accept.getInt1()!=1){
					accept.setInt1(null);
				}
			}
			if (page!=null && size!=null) {
				accept.setStart((page-1)*size);
				accept.setEnd(page*size);
			}
			System.out.println(accept);
			List list=simManagerMapper.queryFenye(accept);
			int rows=simManagerMapper.getCount(accept);
			return new EasyUIPage(rows, list);
		}
		return null;
	}

	public String add(SimManager obj) {
		obj.setIsHistory(new BigDecimal(0));
		obj.setState("启用");
		obj.setCreateTime(new Date());
		simManagerMapper.insertSelective(obj);
		return "添加成功";
	}

	public String update(SimManager obj) {
		System.out.println("修改1"+new Gson().toJson(obj));
		if(obj!=null){
			if(obj.getId()!=null){
				SimManager sm = simManagerMapper.selectByPrimaryKey(obj.getId());
				SimManager newsm = sm;
				newsm.setId(null);
				newsm.setUpdateTime(new Date());
				newsm.setIsHistory(obj.getId());
				simManagerMapper.insertSelective(newsm);
				
				obj.setCreateTime(new Date());
				simManagerMapper.updateByPrimaryKeySelective(obj);
			}
		}
		return "修改成功";
	}

	public String updateState(BigDecimal id){
		SimManager sm = new SimManager();
		sm.setId(id);
		sm.setUpdateTime(new Date());
		sm.setState("注销");
		simManagerMapper.updateByPrimaryKeySelective(sm);
		return "注销成功";
	}
	
	public String delete(BigDecimal id) {
		simManagerMapper.deleteByPrimaryKey(id);
		return "删除成功";
	}

	public SimManager get(BigDecimal id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String importData(List<String[]> list, String str) {
		List<String> li = new ArrayList<String>(); 
		for (int i = 1; i < list.size(); i++) {
			String stano = list.get(i)[0].trim().replace(",", "");
			String phone = list.get(i)[2].trim().replace(",", "");
			if(stano.length()!=6){
				li.add(""+i);
			}else{
				SimManager sm = new SimManager();
				sm.setStano(stano);
				sm.setStanoMan(list.get(i)[1].trim());
				sm.setPhone(phone);
				sm.setSimNumber(list.get(i)[3]);
				sm.setIsHistory(new BigDecimal(0));
				sm.setCreateMan(str);
				sm.setState("启用");
				try {
					//通过条码加时间判断这条数据是否存在
					SimManagerExample se = new SimManagerExample();
					SimManagerExample.Criteria c1 = se.createCriteria();
					c1.andStanoEqualTo(stano);
					c1.andPhoneEqualTo(phone);
					List<SimManager> lsm= simManagerMapper.selectByExample(se);
					if(lsm.size()>0){
						sm.setId(lsm.get(i).getId());
						sm.setState(null);
						update(sm);
					}else{
						add(sm);
					}
				} catch (Exception e) {
					li.add(""+i);
				}
			}
		}
		if(li.size()>0){
			return new Gson().toJson(li)+"行数据有问题";
		}else{
			return "导入成功";
		}
	}

	public String ExportData(EasyUIAccept accept, HttpServletRequest req,HttpServletResponse resp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		List<SimManager> sm = simManagerMapper.queryFenye(accept);
		String[] s={"条码","负责人","手机号码","SIM卡号码","是否注销","创建人","创建时间","修改时间"};
		String[][] obj = new String[sm.size()][s.length];
//		System.out.println(sm.size());
		for (int i = 0; i < sm.size(); i++) {
//			System.out.println(sm.get(i).getStano());
			obj[i][0]=sm.get(i).getStano();
			obj[i][1]=sm.get(i).getStanoMan();
			obj[i][2]=sm.get(i).getPhone();
			obj[i][3]=sm.get(i).getSimNumber();
			obj[i][4]=sm.get(i).getState();
			obj[i][5]=sm.get(i).getCreateMan();
			if(sm.get(i).getCreateTime()==null){
				obj[i][6]="";
			}else{
				obj[i][6]=sdf.format(sm.get(i).getCreateTime());
			}
			if(sm.get(i).getUpdateTime()==null){
				obj[i][7]="";
			}else{
				obj[i][7]=sdf.format(sm.get(i).getUpdateTime());
			}
		}
		String basePath = req.getSession().getServletContext().getRealPath("/");
		resp.setContentType("text/html; charset=UTF-8");
		String path ="file/巴枪SIM卡管控.xls";
		ExcelExport.OutExcel1(s, obj,basePath+path);
		return path;
	}

}
