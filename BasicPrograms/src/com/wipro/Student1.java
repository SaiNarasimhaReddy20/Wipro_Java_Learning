package com.wipro;

import java.util.*;

public class Student1 {
	int id;
	String name;
	int[] marks;
	
	public Student1() {
		System.out.println("Give arguments");
	}
	
	//Constructer
	public Student1(int id,String name,int[] marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public void displayInfo() {
		System.out.println("Student Id :" + id);
		System.out.println("Student Name :" + name);
		System.out.println("Student Marks :" );
		for (int mark:marks) {
			System.out.println(mark+ " ");
		}
		System.out.println("\n............");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the students you want to add in the batch: ");
		int batchSize=sc.nextInt();
		Student1[] students=new Student1[batchSize];
		for (int i=0;i<students.length;i++) {
			System.out.println("enter student id:");
			int id=sc.nextInt();
			System.out.println("enetr the student name: ");
			String name=sc.next();
			System.out.println("enter the no of subjects");
			int n=sc.nextInt();
			int[] marks=new int[n];
			System.out.println("Enter marks for "+n+" subjects");
			for (int j=0;j<n;j++) {
				System.out.println("subject "+ (j+1)+": ");
				marks[j]=sc.nextInt();
			}
			students[i]=new Student1(id,name,marks);
		}
		System.out.println("student details are given below:");
		for(Student1 s:students) {
			s.displayInfo();
		}
		sc.close();
		
	}

}