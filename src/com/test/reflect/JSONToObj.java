package com.test.reflect;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * @classname:JSONToObj
 * @Description:TODO
 * @author admin
 * @Date:2017年6月21日下午5:48:38
 */

public class JSONToObj {
	public static void main(String[] args) {

	}

	public void createJSONString() {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "001");
		map.put("name", "李雷");
		map.put("age", 19);
		JSONObject jsonObject = new JSONObject(map);
	}
}
