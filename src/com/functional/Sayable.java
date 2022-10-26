package com.functional;

public interface Sayable {
	
	default void sayGreeting() {
		System.out.println("Default say");
	}
	
	static void sayLouder() {
		System.out.println("Say Louder ");
	}
	
	void chat(String message);

}
