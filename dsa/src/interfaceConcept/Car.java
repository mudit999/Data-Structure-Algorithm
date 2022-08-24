package interfaceConcept;

public interface Car {
	// 100 % abstraction achieved with Interface
	
	// all methods are abstract only
	// No method body
	// only method declaration
	// No need of abstract keyword
	// we cannot create objects of interface  
	// in this, we can define only final and static variable
	
	// Hiding complete business logic / implementation logic
	
	//An interface can extend other interfaces, just as a class subclass or extend another class. 
	//However, whereas a class can extend only one other class, an interface can extend any number of interfaces. 
	//The interface declaration includes a comma-separated list of all the interfaces that it extends.
	
	// it will be implicitly final and static
	int a = 10;
	
	public void start();
	public void stop();
	public void refuel();
}