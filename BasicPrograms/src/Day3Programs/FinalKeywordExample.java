package Day3Programs;
//class cannot be defined or declared as private or protected
final class ConstantsVariables{
	
	public static final double gst=0.18;
	public static final double pi= 3.14;
	public static final int bonus=1000;
	public static final String companyName="wipro";
}

class Salary{ //default is the access specifier for a class when it is not declared
	@Deprecated() //if we type see the salary is striked use for that//basically remove
	public final double salary(double basicPay) {
		return basicPay*ConstantsVariables.gst;
	}
}

//i want to initialize the Blank variables per object creation
final class User{
	private final int id; //Blank non-static final variables must be initialized in constructor
	private final String name; 
	//private static final int count; //balnk static variables must in static block
	
	public User(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
}

public class FinalKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s = new Salary();
		//double sal=s.salary(40000); //this is also possible with saving valaue in a seperate variable and print
		System.out.println("The Calculated Salary Is :"+s.salary(40000));

	}

}













//Use cases  : final variables
// in malls, ECommerce for discount
//In banks for interset(EMI cal)
//Maths Computation
//in company id cards the code

//use cases  : final class
//grades can be defined in a final class
//checking upi validity in google pay
//checking cibil score

/*
immutability example
public final class User{
{ 
private final int id;
private final String name;

private User(int id,String name{
	this.id=id;
	this.name=name;
}

public int getId(){
	return id;
	}

public int getName(){
	return name;
	}
	
	

 * public final class SecurityValidation{
 * public void login(String user)
 *
 * System.out.println(user + " has logged in")
 * }
 *  //Below method cannot be overridded or extended
 *  public void validateToken(String token)
 *  {
 *    // logic regarding token validation
 

*/









