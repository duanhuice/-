/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StreamUtilTest.java 
 * @Prject: duanhuice-util
 * @Package: com.duanhuice.common.utils 
 * @Description: TODO
 * @author: Administrator
 * @date: 2019年9月6日 上午11:08:21 
 * @version: V1.0   
 */
package com.duanhuice.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/** 
 * @ClassName: StreamUtilTest 
 * @Description: TODO
 * @author:Administrator
 * @date: 2019年9月6日 上午11:08:21  
 */
public class StreamUtilTest {

	/**
	 * Test method for {@link com.duanhuice.common.utils.StreamUtil#closeAll(java.lang.AutoCloseable[])}.
	 */
	@Test
	public void testCloseAll() {
		try {
			String string = StreamUtil.readTextFile(new FileInputStream("E:/hello.txt"));
	
		System.out.println(string);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.StreamUtil#readTextFile(java.io.InputStream)}.
	 */
	@Test
	public void testReadTextFileInputStream() {
		String string = StreamUtil.readTextFile(new File("e:/hello.txt"));
		System.out.println(string);
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.StreamUtil#readTextFile(java.io.File)}.
	 */
	@Test
	public void testReadTextFileFile() {
		String string = StreamUtil.readTextFile(new File("e:/hello.txt"));
		System.out.println(string);
	}

}
