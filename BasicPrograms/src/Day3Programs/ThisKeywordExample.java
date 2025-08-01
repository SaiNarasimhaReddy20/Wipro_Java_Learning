package Day3Programs;

class Person{
	int id;
	String name;
	
	public Person(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public Person() {
		this(101,"Sai"); //Constructer chaining
	}

	void display() {
	System.out.println("ID :"+this.id+" NAME :"+this.name);
	}
	
	// this cannot be used in static context
	//static 
	//{
	//this.id = 30;	
	//}

	static
	{

	System.out.println("Static Block Called :");	
	}
}



public class ThisKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person(102,"chinnu");
		p.display();
	}

}
