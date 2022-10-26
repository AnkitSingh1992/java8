package com.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsTest {
	
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		List<Product> product = productService.createProducts();
		// get price as a list
		List<Double> collectedList = product.stream().map(p->p.getPrice()).collect(Collectors.toList());
	    productService.displayList(collectedList);
	    //get the price as set
		Set<Double> collectedSet = product.stream().map(p->p.getPrice()).collect(Collectors.toSet());
	    productService.displayList(collectedSet);
	    
	    //sum the price and return it
	    Double totalPrice = product.stream().collect(Collectors.summingDouble(prod-> prod.getPrice()));
	    //it provides aggregate methods  
	    System.out.println(totalPrice);
	    
	}

}
