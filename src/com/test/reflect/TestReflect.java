package com.test.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author company Email:
 * @date 2017年6月21日上午11:11:03
 * @description
 * @version 1.0
 * http://blog.csdn.net/zhangliangzi/article/details/51338291
 */
public class TestReflect {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Person p = new Person();
		// p.setName("张三");
		// p.myInfo();

		// 类加载机制
		// BootstrapClassLoader
		// ExtentionClassLoader
		// ApplicationClassLoader/SystemClassLoader

		// 类加载过程，双亲委派模型
		// 类加载器
		// 获取类加载器
		// System.out.println(Test.class.getClassLoader().getClass().getName());
		// System.out.println(Test.class.getClassLoader().getParent().getClass().getName());
		// System.out.println(Test.class.getClassLoader().getParent().getParent());
		// System.out.println(String.class.getClassLoader());
		// System.out.println(sun.security.ec.CurveDB.class.getClassLoader());
		
		//通过Class.forName("xxx");加载一个类
		try {
			//Class c = Class.forName("com.test.reflect.Person");
			ClassLoader classLoader = TestReflect.class.getClassLoader();
			Class<?> c = classLoader.loadClass("com.test.reflect.Person");
			Object obj = c.newInstance();//创建对象
//			Field field = c.getField("no");
//			//获取属性的名称
//			System.out.println(field.getName());
//			//获取属性的类型
//			System.out.println(field.getType().getName());
//			//获取属性的访问权限
//			System.out.println(field.getModifiers());
//			System.out.println(field.getModifiers() == Modifier.PUBLIC);
//			//设置属性值
//			field.set(obj, "002");
//			//获取属性值
//			System.out.println(field.get(obj));
			
			//读取私有的属性
			//Field field = c.getDeclaredField("name");
			//设置该属性可访问
//			field.setAccessible(true);
//			System.out.println(field.getName());
//			field.set(obj, "张三");
//			System.out.println(field.get(obj));
//			System.out.println(field.getModifiers() == Modifier.PRIVATE);
			
			//获取所有已定义的属性
//			Field[] fields = c.getFields();
//			for (Field field : fields) {
//				System.out.println(field.getName());
//			}
			
//			Field[] fields = c.getDeclaredFields();
//			for (Field field : fields) {
//				System.out.println(field.getName());
//			}
			
//			Method method = c.getMethod("setName",String.class);
//			//获取方法名
//			System.out.println(method.getName());
//			//获取方法的返回值类型
//			System.out.println(method.getReturnType().getName());
//			//获取方法的访问权限
//			System.out.println(method.getModifiers());
//			//获取方法的参数列表
//			Class<?>[] parameterTypes = method.getParameterTypes();
//			if (parameterTypes != null && parameterTypes.length > 0) {
//				for (Class<?> class1 : parameterTypes) {
//					System.out.println(class1.getName());
//				}
//			}
			
//			Method[] methods = c.getMethods();
//			for (Method method : methods) {
//				System.out.println(method.getName());
//			}
			
//			Method[] declaredMethods = c.getDeclaredMethods();
//			
//			for (Method method : declaredMethods) {
//				System.out.println(method.getName());
//			}
			
			//调用方法
//			Method method = c.getMethod("myInfo");
//			method.invoke(obj);
			
			//获取类名
			System.out.println(c.getName());
			System.out.println(c.getSimpleName());
			//获取访问权限
			System.out.println(c.getModifiers());
			System.out.println(c.getInterfaces().length);
			for (Class clazz : c.getInterfaces()) {
				System.out.println(clazz.getName());
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
