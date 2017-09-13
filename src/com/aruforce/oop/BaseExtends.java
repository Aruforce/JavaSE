package com.aruforce.oop;

public class BaseExtends extends Base {
	private String sex;

	public BaseExtends() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaseExtends(String sex) {
		super();
		// TODO Auto-generated constructor stub
		this.sex = sex;
	}
	public BaseExtends(String name,String sex) {
		super(name);
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toTestString(){
		return "BaseExtends Method  Invoked";
	}
}
