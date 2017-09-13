package com.aruforce.clazzobjinit;

public class Base {
	static String name ;
	String sex;
	static{
		name = "baseName";
		System.out.println("base static1 invoked");
	}
	
	{
		System.out.println("base obj1 invoked");
	}
	
	public Base() {
		super();
		System.out.println("base constuctor invoked");
	}
	
	{
		System.out.println("base obj2 invoked");
	}
	
	static{
		System.out.println("base static2 invoked");
	}
}
