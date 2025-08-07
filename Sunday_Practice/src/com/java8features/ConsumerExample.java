package com.java8features;
import java.util.function.Consumer;
public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> greet=name -> System.out.println("Hello "+name);
		greet.accept("sai");

	}

}
