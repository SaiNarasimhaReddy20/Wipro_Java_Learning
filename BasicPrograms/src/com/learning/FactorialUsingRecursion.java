// 1. Java Program to Find Factorial Using Recursion

package com.learning;
import java.util.*;


public class FactorialUsingRecursion {
	static int factorial(int num) {
		if (num == 0) {
			return 1;
		}else {
			return num*factorial(num-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(factorial(num));

	}

}
