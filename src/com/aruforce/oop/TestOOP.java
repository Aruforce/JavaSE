package com.aruforce.oop;
/**
 * 
 * @author Aruforce
 * 面向对象的三大特征 数据封装、代码复用、动态绑定 
 * 
 */
public class TestOOP {
	
	public static void main(String[] args) {
		Base base = new Base("name");//数据封装
		BaseExtends baseExtends = new BaseExtends("name", "sex");//数据封装
		System.out.println(baseExtends.getName());//see BaseExtends does not have a method getName(); 代码复用
		
		System.out.println(base.toTestString());//动态绑定 
		System.out.println(baseExtends.toTestString());// BaseExtends changed the function by Override 动态绑定 
	}
}
