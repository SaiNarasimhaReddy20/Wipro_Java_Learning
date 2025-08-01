// 5. Java Program to Check Armstrong Number (for 3-digit number)

package com.learning;
import java.util.*;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int original=num;
		int sum=0;
		while (original != 0) {
			int digit=original%10;
			sum+=Math.pow(digit,3);
			original/=10;
		}
		if (sum == num) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not a Armstrong Number");
		}

	}

}
