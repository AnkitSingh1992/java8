package com.methodReference;

public class Greeting {
	private int a;
	private int b;
	
	Greeting(int a,int b){
		this.a = a;
		this.b = b;
		System.out.println(this.a +"::"+this.b);
	}
	Greeting(){
		System.out.println("Initialization");
	}
	
	public static void sayHello() {
		System.out.println("Good morning friends");
	}
	
	public static void wheaterForcast() {
		System.out.println("Raining...");
	}

	
	public static void sendMsg() {
		try {
			Thread.sleep(3000);
			System.out.println("Thread is running");			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
}
