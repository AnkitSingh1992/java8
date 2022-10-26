package com.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DrawableTest {
	public static void main(String[] args) {
		Implementation implementation = new Implementation();
		System.out.println(implementation.drawable.draw(8));
		System.out.println(implementation.drawable.draw(11));
		
		//start  a new thread
		Thread thread = new Thread(implementation.runnable);
		thread.start();
		
		System.out.println(implementation.drawableSqr.draw(9));
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(2,"camera"));
		productList.add(new Product(3,"mobile"));
		productList.add(new Product(1,"Laptop"));
		
		/*Collections.sort(productList,(ob1,ob2)->{
			  return ob1.getName().compareTo(ob1.getName());  
		});*/
		
		Collections.sort(productList,implementation.sortById);
		
		// filter the data from the list
		
		List<Product> products= productList.stream().filter(obj -> obj.getId()>=2).toList();
		
		products.stream().forEach(System.out::println);
	}

}
