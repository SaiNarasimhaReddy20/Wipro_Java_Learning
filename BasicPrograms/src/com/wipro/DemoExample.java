package com.wipro;

import java.util.Arrays;

class Student {
	int id;
	String name;
	int[] marks; 
	Student(int id,String name,int[] marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}
	
}	

public class DemoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 stu1=new Student1(1,"sai",new int[] {20,30,40});
		Student1 stu2=new Student1(2,"chinnu",new int[] {50,60,70});
		System.out.println(stu1);
		System.out.println(stu2);

	}

}
