import java.util.Scanner;

public class SmartPhone {
	String brand, color, processor;
	int volume, storage, quantity;
	double price, totalPrice;
	

	
	Scanner s = new Scanner(System.in);
	//default constructor
	SmartPhone(){
		System.out.println("Enter the brand");
		this.brand = s.nextLine();
		System.out.println("Enter Color");
		this.color = s.nextLine();
		System.out.println("Enter the volume");
		this.volume = s.nextInt();
		System.out.println("Enter the processor");
		this.processor = s.next();
		System.out.println("Enter the storage");
		this.storage = s.nextInt();
		System.out.println("Enter the price");
		this.price = s.nextDouble();
		System.out.println("Enter the quantity");
		this.quantity = s.nextInt();
		
		this.totalPrice = this.price * this.quantity;
		
	}
	//Parameterized Constructor
	SmartPhone(String brand, String color, int volume, String processor, int storage, double price, int quantity){
		this.brand = brand;
		this.color = color;
		this.volume = volume;
		this.processor = processor;
		this.storage = storage;
		this.price = price;
		this.quantity = quantity;
		this.totalPrice = price * quantity;
		
	}
}

