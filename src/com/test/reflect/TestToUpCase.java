package com.test.reflect;

/**
 * @classname:TestToUpCase
 * @Description:TODO
 * @author admin
 * @Date:2017年6月21日下午4:17:08
 */

public class TestToUpCase {
	public static void main(String[] args) {
		String a = "a";
		char charA = a.charAt(0);
		System.out.println((int) charA);
		System.out.println((char) (charA - 32));
	}
}
