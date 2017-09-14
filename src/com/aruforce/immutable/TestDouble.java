package com.aruforce.immutable;
/**
 * 
 * @author Aruforce
 * Double 是不可变类,但是Java未实现常量池机制，显然数值类型的也不需要
 * public static Double d1 = 1.0 
 * 实际上也是调用 new Doubel();
 */
public class TestDouble {
	public static Double d1 = 1.0;
	public static Double d2 = 1.0;
	public static void main(String[] args) {
		Double d3 = 1.0;
		Double d4 = new Double(1.0);
		System.out.println(d1 == d2);//false
		System.out.println(d1 == d3);//false
		System.out.println(d1 == d4);//false
	}
}
