// 4. Java Program to Find Prime Numbers (Single number)

package com.learning;
import java.util.*;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean isPrime=true;
		if (num<=1) {
			isPrime=false;
		}
		else{
			for(int i=2;i<=Math.sqrt(num);i++) {
				if (num%i == 0) {
					isPrime=false;;
					break;
				}
			}
		}
		if (isPrime) {
		System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
	}

}
