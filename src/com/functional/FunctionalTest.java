package com.functional;

public class FunctionalTest {
	public static void main(String[] args) {

		PredefineFunction predefineFunction = new PredefineFunction();
		System.out.println(predefineFunction.sqrt.apply(10));
		System.out.println(predefineFunction.greaterThan.test(10));
		System.out.println(predefineFunction.getValue.get());
		predefineFunction.showValue.accept(10);
		
		//default and static method of interface
		
		Sayable sayable = new Say();
		sayable.sayGreeting();
		Sayable.sayLouder();
		sayable.chat("Good Morning");
		
	}
}
