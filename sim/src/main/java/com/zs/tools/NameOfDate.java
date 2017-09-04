package com.zs.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 通过日期生成名字类（目的是不重复）
 * @author 张顺
 * <br>2016年9月2日11:30:45
 */
public class NameOfDate {
	
	
	public String getDir() {
		return new SimpleDateFormat("yyyy-MM").format(new Date());
	}
	
	
	public static String getFileName() {
		return new SimpleDateFormat("dHmsS").format(new Date());
	}
	
	/**
	 * 结合随机数和日期生成不重复的数字
	 * @return
	 */
	public static String getNum() {
		return getFileName()+(int)(Math.random()*9000+1000);
	}
	
	/**
	 * 得到一个比较短的不重复的数
	 * @return
	 */
	public static int getShortNum() {
		return (int)(Math.random()*9000+1000);
	}
	
}