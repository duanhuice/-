/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtilTest.java 
 * @Prject: duanhuice-util
 * @Package: com.duanhuice.common.utils 
 * @Description: TODO
 * @author: Administrator
 * @date: 2019年9月6日 上午10:54:06 
 * @version: V1.0   
 */
package com.duanhuice.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: DateUtilTest 
 * @Description: TODO
 * @author:Administrator
 * @date: 2019年9月6日 上午10:54:06  
 */
public class DateUtilTest {

	/**
	 * Test method for {@link com.duanhuice.common.utils.DateUtil#getDateByInitMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByInitMonth() {
	
		Calendar c = Calendar.getInstance();
		c.set(2000, 9, 10);
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat df = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = df.format(date);
		System.out.println(string);
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.DateUtil#getDateByFullMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByFullMonth() {
		 Calendar c = Calendar.getInstance();
		 c.set(2008, 1, 22);
        Date date = DateUtil.getDateByFullMonth(c.getTime());
   
          SimpleDateFormat df = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          String string = df.format(date);
          System.out.println(string);
	}
	
	/**
	 * 拼接下面根据时间范围查询订单的SQL：
String sql = "select * from t_order where create_time>='{1}'
and create_time<='{2}' ";
将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。
最后打印出正确拼接的SQL字符串。
	 */
	
	@Test
	public  void  testsql() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		   //获取当前月初
		Date date = DateUtil.getDateByInitMonth(new Date());
		    //获取当前月末 
		    Date date2 = DateUtil.getDateByFullMonth(new Date());
		    //转化时间格式 
		        SimpleDateFormat df = new  SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
	       String string = sql.replace("{1}", df.format(date)).replace("{2}", df.format(date2));
	       System.out.println(string);
	     
	
	}
	

}
