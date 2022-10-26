package com.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Implementation {

	DrawableInterface drawable = (arc) -> arc;

	DrawableInterface drawableSqr = (arc) -> {
		return arc * 2;
	};

	Runnable runnable = () -> {
		try {
			Thread.sleep(3000);
			System.out.println("Thread is running...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};

	Comparator<Product> sortById = (obj1, obj2) -> {
		if (obj2.getId() > obj1.getId()) {
			return -1;
		} else if (obj2.getId() < obj1.getId()) {
			return +1;
		} else {
			return 0;
		}
	};

}
