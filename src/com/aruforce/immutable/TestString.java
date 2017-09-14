package com.aruforce.immutable;
/**
 * 
 * @author Aruforce
 * {@link String} 是不可变类，Java为String实现了厂里常量池机制除此之外还有String pool机制
 * @see http://www.jianshu.com/p/03c2a325fcff 
 */
public class TestString {
	public static String str1 = "str";
	public static String str2 = "str";
	public static void main(String[] args) {
		String str3 = "str";
		String str4 = new String("str");
		System.out.println(str1 == str2);//true
		System.out.println(str1 == str3);//true
		System.out.println(str1 == str4);//false
	}
}
