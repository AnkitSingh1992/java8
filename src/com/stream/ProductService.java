package com.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductService {

	List<Product> createProducts() {
		List<Product> product = new ArrayList<>();
		product.add(new Product(1, "shirt", 5000.0f));
		product.add(new Product(2, "jens", 9000.0f));
		product.add(new Product(3, "t-shirt", 3000.0f));
		return product;
	}

	public void displayList(Collection collection) {
		System.out.println("==========List DISPLAY==================");
		collection.stream().forEach(System.out::println);
		System.out.println("====================End Display===========");
	}
}
