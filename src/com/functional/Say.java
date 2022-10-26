package com.functional;

public class Say implements Sayable {
	@Override
	public void sayGreeting() {
		System.out.println("Child say");
	}

	@Override
	public void chat(String message) {
		System.out.println("Ankit::"+message);
		
	}
	
	

}
