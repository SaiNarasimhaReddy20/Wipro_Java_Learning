package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
	private static List<Employee> list=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("1. Add  2. ViewAll , 3. Delete , 4. Search , 5. addEmployeeAtPosition()");
			int choice=sc.nextInt();
			switch(choice) {
			case 1 -> addEmployee();
			case 2 -> viewAll();
			case 3 -> delEmployee();
			case 4 -> searchEmployee();
			case 5 -> addEmployeeAtPosition();
			}
		}
		
	}
	
	
	
	static void addEmployee() {
		System.out.println("Enter id, Name, Designation");
		int id=sc.nextInt();
		String name=sc.next();
		String designation=sc.next();
		list.add(new Employee(id,name,designation));
	}
	
	static void viewAll() {
		System.out.println("Viewing Employee Details");
		for (Employee e:list) {
			System.out.println(e);
		}
	}
	
	static void delEmployee() {
	    System.out.println("Enter the ID of the employee to delete for:");
	    int idToDelete = sc.nextInt();
	    boolean found = false;
	    for (Employee e : list) {
	        if (e.getId() == idToDelete) {
	        	list.remove(e);
	            System.out.println("Employee deleted");
	            
	            found = true;
	            break; // Exit the loop once the employee is deleted
	        }
	    }
	    if (!found) {
	        System.out.println("No employee found with ID " + idToDelete);
	    }
	}
	/*
	static void searchEmployee() {
	    System.out.println("Enter the ID of the employee to search for:");
	    int idToSearch = sc.nextInt();
	    boolean found = false;
	    for (Employee e : list) {
	        if (e.getId() == idToSearch) {
	            System.out.println("Employee Found:");
	            System.out.println(e);
	            found = true;
	            break; // Exit the loop once the employee is found
	        }
	    }
	    if (!found) {
	        System.out.println("No employee found with ID " + idToSearch);
	    }
	}
	*/
	static void searchEmployee() {
	    System.out.println("Enter the name of the employee to search for:");
	    String nameToSearch = sc.next();
	    boolean found = false;
	    for (Employee e : list) {
	        if (e.getName().toLowerCase().contains(nameToSearch)) {
	            System.out.println("Employee Found:");
	            System.out.println(e);
	            found = true;
	            break; // Exit the loop once the employee is found
	        }
	    }
	    if (!found) {
	        System.out.println("No employee found with ID " + nameToSearch);
	    }
	}
	
	
	
	
	static void addEmployeeAtPosition() {
		 
		 System.out.println("Enter the position where you want to add the employee:");
		 int position = sc.nextInt();
		 System.out.println("Enter id  , Name , Designation");
		 int id=sc.nextInt();
		 String name= sc.next();
		 String designation = sc.next();
		 if(position>=0 && position<=list.size())
		 list.add(position , new Employee(id,name,designation));
		 else
			 System.out.println("Invalid Position");
		 
	 }	
}
