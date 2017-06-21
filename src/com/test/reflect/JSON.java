package com.test.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @classname:JSON
 * @Description:TODO
 * @author admin
 * @Date:2017年6月21日下午2:10:13
 */
// 拼接JSON字符串，返回即可
/*
 * 1-{"id":1,"username":"zhangsan"."password":"123456"}
 * 2-{"id":1,"username":"zhangsan"."password":"123456","school":{"name":
 * "xx","address","xxxx"}}
 * 3-{"id":1,"username":"zhangsan"."password":"123456","school":{"name":
 * "xx","address","xxxx"}} 4-
 */
public class JSON {
	public static String toJSONString(Object obj) {
		return parse(obj).toString();
	}

	private static Object parse(Object obj) {
		if (obj == null) {
			return null;
		} else if (obj instanceof Byte || obj instanceof Short || obj instanceof Integer || obj instanceof Long
				|| obj instanceof Float || obj instanceof Double || obj instanceof Boolean) {
			return obj;
		} else if (obj instanceof String || obj instanceof Character) {

			return parseString(obj);
		} else if (obj instanceof Object[]) {

			return parseArray((Object[]) obj);
		} else if (obj instanceof Collection) {
			return parseArray(((Collection) obj).toArray());
		} else if (obj instanceof Map) {
			return parseMap((Map) obj);
		} else {
			return parseObject(obj);
		}
	}

	// 转换字符串类型
	private static Object parseString(Object obj) {
		return "\"" + obj + "\"";
	}

	// 转换自定义类型
	private static Object parseObject(Object obj) {
		// 定义StringBuffer用于拼接JSON串
		StringBuffer sb = new StringBuffer();

		// 获取要转换对象的Class对象
		Class c = obj.getClass();

		// 获取所有定义的方法
		Method[] methods = c.getMethods();

		// 解析所有以get开头的方法
		sb.append("{");
		for (Method method : methods) {
			if (method.getName().startsWith("get") && !method.getName().equals("getClass")) {
				StringBuffer methodName = new StringBuffer(method.getName());
				methodName.delete(0, 3);
				char first = methodName.charAt(0);
				char firstToLowerCase = (char) (first + 32);
				methodName.replace(0, 1, String.valueOf(firstToLowerCase));

				// 拼接属性名
				sb.append(parseString(methodName));
				sb.append(":");

				// 拼接属性值
				try {
					Object value = method.invoke(obj);// ?invoke方法？
					sb.append(parse(value)).append(",");
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		sb.delete(sb.length() - 1, sb.length());
		sb.append("}");
		// 拼接成JSON字符串，返回即可
		return sb;
	}

	// 转换Map集合
	private static Object parseMap(Map map) {
		// TODO Auto-generated method stub
		Set<Entry> entrySet = map.entrySet();
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for (Entry entry : entrySet) {
			if (entry.getKey() instanceof String) {
				sb.append(parse(entry.getKey().toString())).append(":").append(parse(entry.getValue())).append(",");
			}

		}
		sb.delete(sb.length() - 1, sb.length());
		sb.append("}");
		return sb;
	}

	// 转换数组
	private static Object parseArray(Object[] objs) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (Object object : objs) {
			sb.append(parse(object) + ",");
		}
		sb.delete(sb.length() - 1, sb.length());
		sb.append("]");
		return sb;
	}

}
