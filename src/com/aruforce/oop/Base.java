package com.aruforce.oop;

public class Base {
	private String name;

	public Base() {
		super();
	}
	public Base(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toTestString(){
		return "Base Method invoked";
	}
}
