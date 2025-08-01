package com.wipro;

public class ArraysExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [][] matrix =new int[4][2];
		//matrix[0][0]=43;
		//matrix[0][1]=32;
		
		int [][] marks0= {
				{23,43,54},
				{12,5,6,99},
				{56,7,42}
		};
		
		int [][] marks00= {
				{23,43}, //s1 took 2 sub
				{12,5,6,99}, //s1 took 2 sub
				{56,7,42,90}, //s1 took 2 sub
		};
		
		//array declaration we called jagged array
		int [][] marks=new int[3][];
		marks[0]=new int[2];
		marks[1]=new int[3];
		marks[2]=new int[4];
		

	}

}
