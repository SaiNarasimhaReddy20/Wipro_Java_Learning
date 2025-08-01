package Activity;
import java.util.Scanner;

public class EmployeeManagement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Employee Management System");
			System.out.println("1. ADD");
			System.out.println("2. VIEW");
			System.out.println("3. SEARCH");
			System.out.println("4. UPDATE");
			System.out.println("5. DELETE");
			System.out.println("6. EXIT");
			System.out.println("Enter Your Choice: ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				Employee.Add();
				break;
			case 2:
				Employee.View();
				break;
			case 3:
				Employee.Search();
				break;
			case 4:
				Employee.Update();
				break;
			case 5:
				Employee.Delete();
				break;
			case 6:
				Employee.Exit();
				break;
			case 7:
				System.out.println("Invalid Choice Chosen");
			}
		}
			
	}

}
