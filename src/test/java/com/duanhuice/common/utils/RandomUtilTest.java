/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: RandomUtilTest.java 
 * @Prject: duanhuice-util
 * @Package: com.duanhuice.common.utils 
 * @Description: TODO
 * @author: Administrator
 * @date: 2019年9月6日 上午11:32:49 
 * @version: V1.0   
 */
package com.duanhuice.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author:Administrator
 * @date: 2019年9月6日 上午11:32:49  
 */
public class RandomUtilTest {

	/**
	 * Test method for {@link com.duanhuice.common.utils.RandomUtil#random(int, int)}.
	 */
	@Test
	public void testRandom() {
		  int a =1;
		  int b =10;
		  int i = RandomUtil.random(a, b);
		  System.out.println(i);
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.RandomUtil#sunRandom(int, int, int)}.
	 */
	@Test
	public void testSunRandom() {
		//获取从1-120岁之间的10个随机年龄
		//获取从1-120岁之间的10个随机年龄
				int[] is = RandomUtil.sunRandom(1, 120, 10);
				for (int i : is) {
					System.out.print(i+"  ");
					
				}
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.RandomUtil#randomCharacter()}.
	 */
	@Test
	public void testRandomCharacter() {
		for (int i =0;i<4;i++) {
			System.out.print(RandomUtil.randomCharacter()+"  ");
		}
	}

	/**
	 * Test method for {@link com.duanhuice.common.utils.RandomUtil#randomString(int)}.
	 */
	@Test
	public void testRandomString() {
		System.out.print(RandomUtil.randomString(6)+" ");
	}

}
