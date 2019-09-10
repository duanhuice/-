/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtilTest.java 
 * @Prject: duanhuice-util
 * @Package: com.duanhuice.common.utils 
 * @Description: TODO
 * @author: Administrator
 * @date: 2019年9月6日 上午11:02:25 
 * @version: V1.0   
 */
package com.duanhuice.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

/** 
 * @ClassName: FileUtilTest 
 * @Description: TODO
 * @author:Administrator
 * @date: 2019年9月6日 上午11:02:25  
 */
public class FileUtilTest {

	/**
	 * Test method for {@link com.duanhuice.common.utils.FileUtil#getExtendName(java.lang.String)}.
	 */
	@Test
	public void testGetExtendName() {
		String file = "abc.doc";
		  String name = FileUtil.getExtendName(file);
		  System.out.println(name);
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.FileUtil#getTempDirectory()}.
	 */
	@Test
	public void testGetTempDirectory() {
		 File file = FileUtil.getTempDirectory();
		  System.out.println(file);
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.FileUtil#getUserDirectory()}.
	 */
	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		 System.out.println(file);
	}

}
