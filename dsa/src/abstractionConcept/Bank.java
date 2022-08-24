package abstractionConcept;

public abstract class Bank {
	
	
	// through abstract class we achieve partial abstraction
	// hiding the implementation logic 
	// abstract class can have abstract as well as non-abstract method
	// we cannot create objects of abstract class
	// In abstract, we can define int variable, final , static
	
	int a =10;
	final String v = "fdf";
	static int c =1000;

	public abstract void loan(); // abstract method - no method body
	
	public void credit() {
		System.out.println("credit --- method");
	}
	
	public void debit() {
		System.out.println("debit --- method");
	
	}
}