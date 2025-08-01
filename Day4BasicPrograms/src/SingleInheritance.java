


// Order ---> OnlineOrder

class Order{
	private String orderId;
	protected double amount;
	public Order(String orderId, double amount) {
		
		this.orderId = orderId;
		this.amount = amount;
	}
	
	private void display() {
		System.out.println("Order Id : "+orderId);
		System.out.println("Amount : "+amount);
	}
	
	
}


class OnlineOrder extends Order{
	private String trackingNumber;
	
		
	public OnlineOrder(String orderId, double amount, String trackingNumber) {
		super(orderId, amount);
		this.trackingNumber = trackingNumber;
	}
	
	public void trackOrder(){
		display();
		System.out.println("Tracking Number : "+trackingNumber);
	}
	
}

public class SingleInheritance {
	
	public static void main(String[] args) {
		OnlineOrder o=new OnlineOrder("ORD101",230.50,"TRIJ123");
		o.displ
		o.trackOrder();
	}

}

