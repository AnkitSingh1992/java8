package com.stream;

import java.util.Arrays;

public class ParallelSorting {
	
	
	public static void main(String[] args) {
		int[] ids = {10,2,5,3,6};
		Arrays.parallelSort(ids);
		for(int i : ids) {
			System.out.println(i);
		}
	}

}
