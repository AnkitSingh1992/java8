package com.methodReference;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class MethodRefernceTest {

	public static void main(String[] args) {

		// calling static method through method
		Sayable say = Greeting::sayHello;
		say.say();

		Sayable wheater = Greeting::wheaterForcast;
		wheater.say();

		// calling instance method

		Runnable runnable = Greeting::sendMsg;
		Thread thread = new Thread(runnable);
		thread.start();
		
		// predefine functional interface
		BiFunction<Integer, Integer, Integer> addition = Greeting::add;
		System.out.println(addition.apply(10, 20));

		// referring a instance method		
		BiFunction<Integer, Integer, Integer> subtraction = new Greeting()::sub;
		System.out.println(subtraction.apply(30, 10));
		
		//referring constructor		
		Sayable message = Greeting::new;
		message.say();		
		BiConsumer<Integer, Integer> constructorArgs = Greeting::new;
		constructorArgs.accept(10, 15);
		

	}
}
