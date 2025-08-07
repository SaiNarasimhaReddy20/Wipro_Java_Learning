package com.java8features;
import java.util.function.Predicate;
public class CalculatorOperations {

	public static void main(String[] args) {
		
		Calculation add=(a,b)->a+b;
		Calculation sub=(a,b)->a-b;
		
		System.out.println("Addition : "+add.Calculator(1, 2));
		System.out.println("Subtraction : "+sub.Calculator(3,1));

	}

}
