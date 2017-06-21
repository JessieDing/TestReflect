package com.test.reflect;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;

/**
 * @classname:TestToObj
 * @Description:TODO
 * @author admin
 * @Date:2017年6月21日下午6:09:16
 */

public class TestToObj {
	@Test
	public void createJSONObject() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", "001");
		jsonObject.put("name", "李雷");
		jsonObject.put("age", 19);
		System.out.println(jsonObject.toJSONString());
	}
}
