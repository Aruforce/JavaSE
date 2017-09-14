package com.aruforce.immutable;
/**
 * 
 * @author Aruforce
 * {@link Integer} 是不可变类，Java为介于-128-0-127的实现了常量池
 * public static Integer i1 = 127;被编译器优化为
 * public static Integer i1 = Integer.valueOf(1);
 */
public class TestInteger {
	public static Integer i1 = 127;
	public static Integer i2 = 127;
	public static void main(String[] args) {
		Integer i3 = 127;
		Integer i4 = new Integer(127);
		System.out.println(i1 == i2);// true
		System.out.println(i1 == i3);// true
		System.out.println(i1 == i4);// false
	}
}
