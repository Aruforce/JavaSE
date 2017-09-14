package com.aruforce.immutable;
/**
 * 
 * @author Aruforce
 * Character 为不可变类，Java为（Character c int值在127以下时）实现了常量池机制 
 * 直接赋值'public static Character character1 = 'A' 被编译器优化为
 * 'public static Character character1 = Character.valueOf('A')'
 * 
 */
public class TestCharactor {
	public static Character character1 = 'A';
	public static Character character2 = 'A';
	public static Character character11 = '中';
	public static void main(String[] args) {
		Character character3 = 'A';
		Character character4 = new Character('A');
		System.out.println(character1 == character2);//true
		System.out.println(character1 == character3);//true
		System.out.println(character1 == character4);//false
		Character character12 = '中';
		Character character13 = new Character('中');
		System.out.println(character11 == character12);//false
		System.out.println(character12 == character13);//false
	}
}
