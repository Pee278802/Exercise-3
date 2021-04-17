
public class Main {

	public static void main(String[] args) {
		SmartPhone a = new SmartPhone();
		System.out.println("------Smartphone a------");
		System.out.println("Brand: " + a.brand);
		System.out.println("Color: " + a.color);
		System.out.println("Volume: " + a.volume);
		System.out.println("Processor: " + a.processor);
		System.out.println("Storage: " + a.storage + "GB");
		System.out.println("Price: " + a.price);
		System.out.println("Quantity: " + a.quantity);
		System.out.println("Total Price: " + a.totalPrice);
		
		System.out.println();
		
		SmartPhone b = new SmartPhone("Samsung", "White", 20, "Android", 32, 2000, 2);
		System.out.println("------Smartphone b-------");
		System.out.println("Brand: " + b.brand);
		System.out.println("Color: " + b.color);
		System.out.println("Volume: " + b.volume);
		System.out.println("Processor: " + b.processor);
		System.out.println("Storage: " + b.storage + "GB");
		System.out.println("Price: " + b.price);
		System.out.println("Quantity: " + b.quantity);
		System.out.println("Total Price: " + b.totalPrice);
	}

}
