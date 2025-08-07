public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> greetings = name -> System.out.println("Hello" + name );
		
		greetings.accept("Niti");

	}

}