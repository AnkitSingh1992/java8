package com.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		StringJoiner joiner =new StringJoiner(",");
		joiner.add("ravi");
		joiner.add("mohan");
		System.out.println(joiner);
		
		//adding prefix and sufix		
		StringJoiner preSuf =new StringJoiner(",", "[", "]");
		preSuf.add("syam");
		preSuf.add("rajiv");
		System.out.println(preSuf);
		
		StringJoiner preSuf2 = new StringJoiner(":","[","]");
		preSuf2.add("shohan");
		preSuf2.add("mohan");
		//merge two String joiner 		
		StringJoiner mergeResult = preSuf.merge(preSuf2);
		System.out.println(mergeResult);
	}

}
