package com.aruforce.immutable;
/**
 * 
 * @author Aruforce
 * {@link Long} 是不可变类，Java为介于-128-0-127的实现了常量池
 * public static Long i1 = 127;被编译器优化为
 * public static Long i1 = Long.valueOf(1);
 */
public class TestLong {
	public static Long l1 = 127l;
	public static Long l2 = 127l;
	public static void main(String[] args) {
		Long l3 = 127l;
		Long l4 = new Long(127l);
		System.out.println(l1 == l2);// true
		System.out.println(l1 == l3);// true
		System.out.println(l1 == l4);// false
	}

}
