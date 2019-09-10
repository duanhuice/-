/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StringUtilTest.java 
 * @Prject: duanhuice-util
 * @Package: com.duanhuice.common.utils 
 * @Description: TODO
 * @author: Administrator
 * @date: 2019年9月8日 下午8:29:30 
 * @version: V1.0   
 */
package com.duanhuice.common.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date; 
      

import org.junit.Test;
            
/** 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author:Administrator
 * @date: 2019年9月8日 下午8:29:30  
 */
public class StringUtilTest {

	/**
	 * Test method for {@link com.duanhuice.common.utils.StringUtil#toHtml(java.lang.String)}.
	 */
	@Test
	public void testToHtml() {
		String   a="dafsdfdsfsdfafjksdjk\rafaksldfjl";
		String string = StringUtil.toHtml(a);
		System.out.println(string);
		
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.StringUtil#isPhoneNumber(java.lang.String)}.
	 */
	@Test
	public void testIsPhoneNumber() {
		  String  a ="75827153373";
		  boolean m = StringUtil.isPhoneNumber(a);
		  System.out.println(m);
		  
		  String  b ="15827153373";
		  boolean m1 = StringUtil.isPhoneNumber(b);
		  System.out.println(m1);
		  
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.StringUtil#isEmail(java.lang.String)}.
	 */
	@Test
	public void testIsEmail() {
		String  m =".@qq.com";
		  boolean b = StringUtil.isEmail(m);
	 System.out.println(b);	
	
	 String  m1 ="280307692@qq.com";
	 boolean b1 = StringUtil.isEmail(m1);
	 System.out.println(b1);	  
	  
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.StringUtil#hasLength(java.lang.String)}.
	 */
	@Test
	public void testHasLength() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.StringUtil#hasText(java.lang.String)}.
	 */
	@Test
	public void testHasText() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.StringUtil#randomSimpleChinese()}.
	 */
	@Test
	public void testRandomSimpleChinese() {
		for(int i=0;i<10;i++) {
			 String string = StringUtil.randomChineseString();
			 System.out.print(string+" ");
		 }
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.StringUtil#randomChineseString()}.
	 */
	@Test
	public void testRandomChineseString() {
		 for(int i=0;i<10;i++) {
			 String string = StringUtil.randomSimpleChinese();
			 System.out.print(string+" ");
		 }
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.StringUtil#randomChineseString(int)}.
	 */
	@Test
	public void testRandomChineseStringInt() {
		String string = StringUtil.randomChineseString(10);
		System.out.println(string);
		
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.StringUtil#generateChineseName()}.
	 */
	@Test
	public void testGenerateChineseName() {
		 for(int i=0;i<10;i++) {
				String string = StringUtil.generateChineseName();
				System.out.println(string);
				 }
	}

	@Test
	public void genderatePerson() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		
		for(int i =0;i<10000;i++) {
			Person person = new Person(StringUtil.generateChineseName(),RandomUtil.random(1, 120),
					StringUtil.randomChineseString(140),DateUtil.randomDate(c.getTime(), new Date()));
			System.out.println(person);
		}
		
		
	}
	
	
}
