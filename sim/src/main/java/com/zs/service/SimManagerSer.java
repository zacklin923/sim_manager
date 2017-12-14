package com.zs.service;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zs.entity.SimManager;
import com.zs.entity.other.EasyUIAccept;

public interface SimManagerSer extends BaseService<SimManager, BigDecimal>{

	public String  importData(List<String[]> list,String str);
	
	public String ExportData(EasyUIAccept accept,HttpServletRequest req,HttpServletResponse resp);
	
	public String updateState(BigDecimal id);
}
