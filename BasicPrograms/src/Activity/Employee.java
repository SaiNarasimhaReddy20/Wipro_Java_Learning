/*
Create an Employee class with the following fields: id, name, position, and salary. 
Then, create an array of Employee objects and develop a menu-driven program that allows the user to:
	Add a new employee
	View all employees
	Search for employees by name (using .contains() and .toLowerCase() for case-insensitive matching)
	Update employee details by ID
	Delete an employee by ID
	Exit the program

Also, use relevant String operations such as .equalsIgnoreCase(), .contains(), .toLowerCase(), and .trim() 
for accurate and clean input handling.
*/

package Activity;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;


public class Employee{
	int id;
	String name;
	String position;
	double salary;
	
	static int count=0;
	static int empSize=1;
	static Employee[] emp=new Employee[empSize];
	
	//Creating a constructor of Employee class
	Employee(int id,String name, String position,double salary) {
		this.id=id;
		this.name=name;
		this.position=position;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	
	//add a new employee
	public static void Add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id=sc.nextInt();
		
		System.out.println("Enter the name: ");
		String name=sc.next();
		
		System.out.println("Enter the position: ");
		String position=sc.next();
		
		System.out.println("Enter the salary: ");
		double salary=sc.nextDouble();
		
		System.out.println("Details Entered Sucessfully");
		emp[count++] = new Employee(id,name,position,salary);
		
		}
	
	// to view an employee
	public static void View() {
		for (int i=0;i<empSize;i++) {
			System.out.println("ID :"+emp[i].id);
			System.out.println("NAME :"+emp[i].name);
			System.out.println("POSITION :"+emp[i].position);
			System.out.println("SALARY :"+emp[i].salary);
		}
	}
	
	//to search for an Employee
	public static void Search() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of employee you want to search: ");
		String searchName=sc.next().trim().toLowerCase();
		for (int i=0;i<empSize;i++) {
			if (emp[i].name.contains(searchName)) {
				emp[i].View();
			}
		}
	}
	
	//to update the Employee
	public static void Update() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of employee you want to update: ");
		int updateID=sc.nextInt();
		for (int i=0;i<empSize;i++) {
			if (emp[i].id==updateID) {
				System.out.println("Enter the new name: ");
				emp[i].name=sc.next();
				
				System.out.println("Enter the new position: ");
				emp[i].position=sc.next();
				
				System.out.println("Enter the new salary: ");
				emp[i].salary=sc.nextDouble();
				
				System.out.println("Details Updated Sucessfully");
			}
		}
	}
	
	//to delete the Employee
	public static void Delete() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id which you what to delete :");
		int delID=sc.nextInt();
		for (int i=0;i<empSize;i++) {
			if (emp[i].id==delID) {
				emp[i]=null;
			}else {
				System.out.println("Employee ID Not Found");
			}
		}
	}
	
	//to exit
	public static void Exit(){
		System.exit(0);
	}
}


