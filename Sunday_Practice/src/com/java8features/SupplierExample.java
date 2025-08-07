package com.java8features;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Double> randNum=() -> Math.random();
		
		System.out.println(randNum.get());
		

	}

}
