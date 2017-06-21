package com.test.reflect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * @author company Email:
 * @date 2017年6月21日下午2:07:48
 * @description
 * @version 1.0
 */
public class TestJSON {

	@Test
	public void testToJSONString() {
		Map map = new HashMap<>();
		map.put("name", "张三");
		map.put("age", 20);
		map.put(123, 456);
		map.put("char",'c');
		map.put("array", new Object[]{1,2,3,4});
		
		Person p = new Person();
		p.setName("zhangsan");
		p.setSex("男");
		
		User user = new User();
		user.setId(1);
		user.setUsername("zhangsan");
		user.setPassword("123456");
		user.setNumbers(new Object[]{1,2,3,"hello",'d',123.123});
		user.setMap(map);
		user.setP(p);
		

		System.out.println(JSON.toJSONString(user));
	}

	@Test
	public void testBasicType() {
		System.out.println(JSON.toJSONString((byte) 1));
		System.out.println(JSON.toJSONString((short) 1));
		System.out.println(JSON.toJSONString(1));
		System.out.println(JSON.toJSONString(1L));
		System.out.println(JSON.toJSONString(1.0F));
		System.out.println(JSON.toJSONString(1.1));
		System.out.println(JSON.toJSONString(true));
		System.out.println(JSON.toJSONString("hello"));
		System.out.println(JSON.toJSONString('o'));
	}

	@Test
	public void testCollection() {
		// System.out.println(JSON.toJSONString(new
		// Object[]{1,2,3,"hello",'d',123.123}));
		// Set set = new HashSet<>();
		// set.add(1);
		// set.add(2);
		// set.add(3);
		// set.add("22");
		// set.add('2');
		// System.out.println(JSON.toJSONString(set));

		// List list = new ArrayList<>();
		// list.add(1);
		// list.add(2);
		// list.add(3);
		// list.add("22");
		// list.add('3');
		// list.add(null);
		//
		// System.out.println(JSON.toJSONString(list));
		
		Map map = new HashMap<>();
		map.put("name", "张三");
		map.put("age", 20);
		map.put(123, 456);
		map.put("char",'c');
		map.put("array", new Object[]{1,2,3,4});
		
		System.out.println(JSON.toJSONString(map));
	}
}
