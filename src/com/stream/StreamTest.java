package com.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		List<Product> products = productService.createProducts();
		
		/*filter the collection
		want to get all the price list from the collection 
		 which is greater than given value*/
		
		List<Double> priceList = products.stream()
				 .filter(prod->prod.getPrice()>4000) //filter data
				 .map(prod->prod.getPrice()) //map only price
				 .collect(Collectors.toList()); // collect into list
		productService.displayList(priceList);
		
		//filter and display the name of product
		
		products.stream().filter(p->p.getPrice()>4000).forEach(prod-> System.out.println(prod.getName()));
	
		
		long count = products.stream().filter(p->p.getPrice()>4000).count();
		System.out.println("Count="+count);
		//add the price
		//double totalPrice = products.stream().map(p->p.getPrice())
			//	       .reduce(1000.0,(sum, price)->sum + price);
		
		double totalPrice = products.stream().map(p->p.getPrice())
			       .reduce(0.0,Double::sum);
		
	     System.out.println("total price ="+totalPrice);
	     
	     // find min value acording to compartor logic
	     Product minPrice = products.stream().min((prod1,prod2)-> prod1.getPrice()>prod2.getPrice()? 1: -1).get(); 
	     System.out.println(minPrice);
	     
	     // find min value acording to compartor logic
	     Product maxPrice = products.stream().max((prod1,prod2)-> prod1.getPrice()>prod2.getPrice()? 1: -1).get(); 
	     System.out.println(maxPrice);
	    
	     //convert list into map
	     Map<String,Double> productMap = products.stream().collect(Collectors.toMap(product->product.getName(), (p)->p.getPrice()));
	     System.out.println(productMap);
	     
		//iterate with static data
				Stream.iterate(1, element->element+1)  
		        .filter(element->element%5==0)  
		        .limit(5)  
		        .forEach(System.out::println);
	
	}
	

}
