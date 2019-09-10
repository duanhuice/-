/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Person.java 
 * @Prject: duanhuice-util
 * @Package: com.duanhuice.common.utils 
 * @Description: TODO
 * @author: Administrator
 * @date: 2019年9月8日 下午8:50:49 
 * @version: V1.0   
 */
package com.duanhuice.common.utils;

import java.util.Date;

/** 
 * @ClassName: Person 
 * @Description: TODO
 * @author:Administrator
 * @date: 2019年9月8日 下午8:50:49  
 */
public class Person {
	private String name;
	private Integer age;
	private String about;
	private Date regDate;//注册日期
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Person() {
		super();
	}
	public Person(String name, Integer age, String about, Date regDate) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", regDate=" + regDate + "]";
	}
	
}
