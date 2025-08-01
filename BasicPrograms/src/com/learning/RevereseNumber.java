// 3. Java Program to Reverse a Number

package com.learning;
import java.util.*;

public class RevereseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int reversed=0;
		while (num != 0) {
			int digit=num%10;
			reversed=reversed*10+digit;
			num=num/10;
		}
		System.out.println(reversed);

	}

}
