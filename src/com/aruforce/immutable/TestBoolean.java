package com.aruforce.immutable;
/**
 * 
 * @author Aruforce
 * Booelean 为不可变类,Java实现了 常量池机制。
 * 直接赋值'public static Boolean flag1 = true;' 会被优化成 
 * 'public static Boolean flag1 = Boolean.valueOf(true);'返回一个Boolean的固定地址
 */
public class TestBoolean {
	public static Boolean flag1 = true;//常量池
	public static Boolean flag2 = true;//常量池
	public static void main(String[] args) {
		System.out.println(flag1==flag2);//true
		Boolean flag3 = new Boolean(true);//堆内的对象
		System.out.println(flag1 == flag3);//false
		Boolean flag4 =true;//常量池
		System.out.println(flag1 == flag4);//true
		flag4 = new Boolean(false);//堆内的对象
		System.out.println(flag3 == flag4);//false
	}
}