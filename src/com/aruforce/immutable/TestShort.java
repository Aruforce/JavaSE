package com.aruforce.immutable;
/**
 * 
 * @author Aruforce
 * {@link Short} 是不可变类，Java为介于-128-0-127的实现了常量池
 * public static Short i1 = 127;被编译器优化为
 * public static Short i1 = Short.valueOf(1);
 */
public class TestShort {
	public static Short s1 = 127;
	public static Short s2 = 127;
	public static void main(String[] args) {
		Short s3 = 127;
		Short s4 = new Short((short)127);
		System.out.println(s1 == s2);// true
		System.out.println(s1 == s3);// true
		System.out.println(s1 == s4);// false
	}
}
