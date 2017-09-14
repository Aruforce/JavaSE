package com.aruforce.immutable;

/**
 * 
 * @author Aruforce
 * Byte为不可变类，Java为其实现了常量池机制
 * 直接赋值'public static Byte b1 = 1' 会被优化成 
 * 'Byte.valueOf(1)' 返回ByteCache.cache[]里面对应的值
 */
public class TestByte {
	public static Byte b1 = 1;//常量池
	public static Byte b2 = 1;//常量池
	public static void main(String[] args) {
		System.out.println(b1 == b2);
		Byte b3 = 1;
		System.out.println(b1 ==b3);
		Byte b4 = new Byte((byte)1);
		System.out.println(b1==b4);
		System.out.println(Byte.valueOf(b1));
	}
}
