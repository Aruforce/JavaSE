package com.aruforce.immutable;
/**
 * 
 * @author Aruforce
 * Float 是不可变类,但是Java未实现常量池机制，显然数值类型的也不需要
 * public static Float f1 = 1.0f; 
 * 实际上也是调用 new Float();
 */
public class TestFloat {
	public static Float f1 = 1.0f;
	public static Float f2 = 1.0f;
	public static void main(String[] args) {
		Float f3 = 1.0f;
		Float f4 = new Float(1.0f);
		System.out.println(f1 == f2);//false
		System.out.println(f1 == f3);//false
		System.out.println(f1 == f4);//false
	}
}
