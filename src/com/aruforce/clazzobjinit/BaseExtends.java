package com.aruforce.clazzobjinit;

public class BaseExtends extends Base {
	
	static String extendsName;
	String extendsSex;
	static{
		extendsName = "extendsName";
		System.out.println("extends static1 invoked");
	}
	{
		System.out.println("extends obj1 invoked");
	}
	
	public BaseExtends() {
		super();
		System.out.println("extends constuctor invoked");
	}
	{
		System.out.println("extends obj2 invoked");
	}
	static{
		System.out.println("extends static2 invoked");
	}
}
