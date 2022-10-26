package com.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalTest {

	public static void main(String[] args) {

		String name = null;
		// if value is not available then return nullPointerException
		// Optional<String> val = Optional.ofNullable(name);

		// if value is not available then return empty optional object
		Optional<String> val = Optional.ofNullable(name);
		// if value is present then return true else false
		if (val.isPresent()) {
			System.out.println("get = " + val.get());
		}

		// if the object is empty then return true
		// val.isEmpty();

		Optional<String> product = Optional.ofNullable("product");
		// String product = Optional.ofNullable(null);
		// if the value is available then execute a respected consumer
		// with lamda expression
		product.ifPresent(p -> System.out.println(p));

		// with method reference
		product.ifPresent(OptionalTest::showProduct);

		Optional<Integer> number = Optional.ofNullable(30);
		// if the predicate return true the you get optional value object else optional
		// empty object
		number.filter((n) -> n > 20).ifPresent((value) -> System.out.println(value));
		
		
		//uses of map
		Optional<Topic> topic =  Optional.ofNullable(new Topic(1, "JAVA"));
	
		//Optional<Topic> topic =  Optional.ofNullable(null);
		topic.map( (topics) -> new Topic(topics.getId(), "SPRING")).ifPresent(t->System.out.println(t));;
		
		// if the optional value is available then modify 
		//mapping of an object and return it  and if optional object
		// is null then it return empty object
		topic.map(top->{
			top.setId(top.getId());
			top.setName("HIBERNATE");
			return top;
		}).ifPresent(t->System.out.println(t));
		
		topic.flatMap(top->{
			top.setId(top.getId());
			top.setName("SPRINT-BOOT");
			return Optional.ofNullable(topic);
		}).ifPresent(t->System.out.println(t.get()));
		
		//OrElse : if the value is available then return the value 
		//else return the other value		
		Optional<String> message = Optional.ofNullable("Autorized");
		System.out.println(message.orElse("Default Value"));
		
		//orElseGet
		Optional<String> token = Optional.ofNullable(null);
		System.out.println(token.orElseGet(()->"Invalid Token"));
		
		//orElseThrow
	//	System.out.println(token.orElseThrow());
		
		Optional<String> value1 = Optional.ofNullable("Apple");
		
		Optional<String> value2 = Optional.ofNullable("Apple");
		
		System.out.println(value1.equals(value2));

		System.out.println(topic.toString());
		//return an generated hashcode
		System.out.println(value1.hashCode());
 	}

	
	static void showProduct(String product) {
		System.out.println("Your product :: " + product);
	}
	
	static Topic modifyTopic(Topic topic) {
		topic.setName("SPRINT");
		return topic;
	}

	static boolean isExist(int val) {
		if (val > 20) {
			return true;
		} else {
			return false;
		}
	}

}
