/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtil.java 
 * @Prject: duanhuice-utils
 * @Package: com.duanhuice.common.utils 
 * @Description: TODO
 * @author: Administrator
 * @date: 2019年9月5日 下午4:16:38 
 * @version: V1.0   
 */
package com.duanhuice.common.utils;

import java.util.Calendar;
import java.util.Date;

/** 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author:Administrator
 * @date: 2019年9月5日 下午4:16:38  
 */
public class DateUtil {
	/**
	 * 
	 * @Title: getDateByMonthSub 
	 * @Description: 用传入的日期减去对应的月份
	 * @param date
	 * @param month
	 * @return
	 * @return: Date
	 */
	
	public static Date getDateByMonthSub(Date date,Integer month) {
		
		 Calendar c = Calendar.getInstance();
		 //用传入的日期,初始化日历类
		 c.setTime(date);
		 //用日历类减去month
		 c.add(Calendar.MONTH, -month);
		return c.getTime();
	}
	
	
	
	//返回一个在某个时间段的随机日期
	
		public static Date randomDate(Date minDate ,Date maxDate) {
			//从1970年到minDate的毫米数
			long l1 = minDate.getTime();
			//从1970年到maxDate的毫米数
			long l2 = maxDate.getTime();
			
			Calendar c = Calendar.getInstance();
			
		//	
			long l3 = (long) (Math.random() * (l2-l1 +1 )+l1);
			c.setTimeInMillis(l3);
			
			return c.getTime();
			
			
		}
	/*
	* 方法1：(5分)    返回传入日期的月初
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public  static Date  getDateByInitMonth(Date src) {
		 //获取日历类
		 Calendar c = Calendar.getInstance();
		 //根据传入的日期构建日历类
		   c.setTime(src);
        //设置月初
		   c.set(Calendar.DAY_OF_MONTH, 1);//日
		   c.set(Calendar.HOUR_OF_DAY, 0);//小时
		   c.set(Calendar.MINUTE, 0);//分钟
		   c.set(Calendar.SECOND, 0);
		   
		return c.getTime();
		
	}  
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		 //1.让插入的月份加1,2再让日期变为月初 3.让日期减去1秒
		//2019-09-05   ->>2019-10-05 --->>2019-10-01 :0:0:0 在减去1秒
		  Calendar c = Calendar.getInstance();
		   c.setTime(src);
		 //让月份加1
		   c.add(Calendar.MONTH, 1);
		   //让日期变为月初
		    Date date = getDateByInitMonth(c.getTime());
		   //让月初初始化日期类
		    c.setTime(date);
		    //让日期减去1秒
		    c.add(Calendar.SECOND, -1);
		return c.getTime();	
	}	
}
