package com.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefineFunction {
	
	public Function<Integer,Integer> sqrt = (val) -> val*val;
	
	public Predicate<Integer> greaterThan = (val) -> val > 10;	
	
	public Consumer<Integer> showValue = (val) -> System.out.println("Your value is = "+val);

    public Supplier<Integer> getValue = () -> 18;

	
}
