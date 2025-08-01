// 6. Java Program to Count the Number of Digits in a Number

package com.learning;
import java.util.*;

public class CountNumberOfDigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		while(num != 0) {
			num/=10;
			count++;
		}
		System.out.println(count);

	}

}
