package com.test.reflect;

import java.util.HashMap;
import java.util.Map;

/**
 * @classname:User
 * @Description:TODO
 * @author admin
 * @Date:2017年6月21日下午2:09:28
 */

public class User {
	private Integer id;
	private String username;
	private String password;
	private Object[] numbers = new Object[] { 1, 2, 3, 4, 5, "123" };
	private Map<String, Object> map = new HashMap<String, Object>();
	private Person p = new Person();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Object[] getNumbers() {
		return numbers;
	}

	public void setNumbers(Object[] numbers) {
		this.numbers = numbers;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

}
