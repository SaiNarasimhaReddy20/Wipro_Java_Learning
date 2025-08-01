package oops;

//E-commerce  -- users are paying using either credit card  ,  cod  ,  upi(Google Pay , PhonePe etc.)
//vendor specific implementation --  Abstract or Interface -- Abstraction
//Payment processing -- polymorphism
//user id  , password  , roles  -- Encapsulation(Data Validations)

//first will try overloading
/*
class payingMethod{
	public void processPayment() {
		
	}
	public void processPayment(double amount) {
		System.out.println("Payment Processed Sucessfully without GST through parent method "+amount);
	}
	public void processPayment(double amount,int gst) {
		System.out.println("Payment Processed Sucessfully with GST through parent method "+amount);
	}
}

class Amazon extends payingMethod{
	
	class amazonpay extends payingMethod{
		public void processPayment(double amount) {
			System.out.println("Payment Processed Sucessfully through AMAZONPAY "+amount);
		}
	}
	
	class razorpay extends payingMethod{
		public void processPayment(double amount) {
			System.out.println("Payment Processed Sucessfully through RAZORPAY "+amount);
		}
	}
		
}

public class Polymorphism {
	
	public static void main(String[] args)
	
	{
		Amazon a=new Amazon();
		
		Amazon.razorpay rp=a.new razorpay();
		rp.processPayment(1000,12345);
		
		Amazon.amazonpay ap=a.new amazonpay();
		ap.processPayment(2000);

	}

}
*/

//will try overidding

class payingMethod{
	public void processPayment() {
		
	}
	public void processPayment(double amount) {
		System.out.println("Payment Processed Sucessfully through parent method "+amount);
	}
	
}

class Amazon extends payingMethod{
	
	class amazonpay extends payingMethod{
		/*
		public void processPayment(double amount) {
			System.out.println("Payment Processed Sucessfully through AMAZONPAY "+amount);
		}
		*/
	}
	
	class razorpay extends payingMethod{
		public void processPayment(double amount) {
			System.out.println("Payment Processed Sucessfully through RAZORPAY "+amount);
		}
	}
		
}

public class Polymorphism {
	
	public static void main(String[] args)
	
	{
		Amazon a=new Amazon();
		
		Amazon.razorpay rp=a.new razorpay();
		rp.processPayment(1000);
		
		Amazon.amazonpay ap=a.new amazonpay();
		ap.processPayment(2000);

	}

}


































/*

//So payment class in which we have a paymentProcessing method which is common for all the vendors

//Base/Parent/Super Class which Amazon has created 
class PaymentMethod
{
	 // Example of Overloading
	public void processPayment(double amount)
	{
		System.out.println("Processing payment is done of Rs. " + amount);
	}
	
	public void processPayment(int amount , int gstNumber)
	{
		System.out.println("Processing payment is done of Rs. " + amount);
	}
}

// Child/Sub/Derived Class overriding the processPayment Method
class Zara extends PaymentMethod
{
	
	class CreditCard extends PaymentMethod
	{
		
//		public void processPayment(double amount)
//		{
//			System.out.println("Payment is done via Credit Card :" + amount);
//		}
		
	}
	
	class Upi extends PaymentMethod
	{
		
		public void processPayment(double amount)
		{
			System.out.println("Payment is done via Upi :"+ amount);
		}
		
	}



}


//Child/Sub/Derived Class
class Nike extends PaymentMethod
{
	
	class CreditCard extends PaymentMethod
	{
		
		public void processPayment(double amount , int gstNumber)
		{
			System.out.println("Payment is done via Credit Card :" + amount);
		}
		
		public void processPayment(double amount )
		{
			System.out.println("Payment is done via Credit Card without GST :" + amount);
		}
		
		
	}
	
	class Upi extends PaymentMethod
	{
		
		public void processPayment(double amount , int gstNumber)
		{
			System.out.println("Payment is done via Upi  :" + amount);
		}
		
	}



}

public class Polymorphism {
	
	public static void main(String[] args)
	
	{
		
		
		Zara zara = new Zara();
		
		
		Nike nike = new Nike();

     Zara.CreditCard cc = zara.new CreditCard(); 
     cc.processPayment(1000);

     Zara.Upi upi = zara.new Upi();
     upi.processPayment(500);
		
     
     Nike.CreditCard cc1 = nike.new CreditCard(); 
     cc1.processPayment(6000,346657);

     Nike.Upi upi1 = nike.new Upi();
     upi1.processPayment(700,678687);
		
     
     
     
//		PaymentMethod p = z.new CreditCard();
//		p.processPayment(10000);
//		PaymentMethod p1 = z.new Upi();
//		p1.processPayment(600);
		
		
	}

}

*/
