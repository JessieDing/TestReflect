package com.test.reflect;

import java.io.Serializable;

/**
 * @author company Email:
 * @date 2017年6月21日上午11:10:04
 * @description
 * @version 1.0
 */
/*
 * ?必须implements Serializable 接口吗?
 */
public class Person implements Serializable {
	public String no = "001";
	private String name = "张三";
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void myInfo() {
		System.out.println("hello，我的名字叫：" + this.name);
	}

}
