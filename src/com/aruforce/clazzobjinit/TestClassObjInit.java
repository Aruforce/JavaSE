package com.aruforce.clazzobjinit;
/**
 * 
 * @author Aruforce
 * 初始化规则：下面规则优先级从前往后依次降低
 * 0.加载一个类时先初加载并初始化基类后加载并初始化扩展类；
 * 1.类的初始化高于对象的初始化:
 * 	类的初始化依靠静态代码（被static标识的），包括静态变量=》静态代码块=》静态方法 。这些用于初始化类的成员只会在类被加载时执行一次；
 * 	对象的初始化依靠实例变量、代码块、构造方法，这些在对象每次被创建时都要执行一次；
 * 2.变量声明执行优先级高于代码块执行,代码块高于构造函数；
 * 3.声明顺序和执行顺序一致;
 */
public class TestClassObjInit {
	public static void main(String[] args) {
		new BaseExtends();
		new BaseExtends();
	}
}
