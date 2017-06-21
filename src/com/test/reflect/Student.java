package com.test.reflect;

/**
 * @classname:Student
 * @Description:TODO
 * @author admin
 * @Date:2017年6月21日下午6:00:48
 */

public class Student {
	public String id;
	private String name;
	private Integer age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

}
