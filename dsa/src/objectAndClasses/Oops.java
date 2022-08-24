package objectAndClasses;

class Vechile{
	String color;
	int maxSpeed;
	
	public Vechile(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
//	public Vechile() {
//		
//	}
	
	public void print() {
		System.out.println("from parent");
	}
}

class Car extends Vechile{
	
	public Car(){
		super(100);
		System.out.println("Own constructor");
	}
	
	int numDoors;
	
	public void print() {
		super.print();
		System.out.println("from child");
	}
}

class Bicycle extends Vechile{
	public Bicycle(){
		super(1000);
		System.out.println("Own constructor");
	}
	boolean gearWali;
}

public class Oops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c= new Car();
		c.color = "red";
		c.maxSpeed = 90;
		c.numDoors = 4;
		c.print();
		
	}
}
