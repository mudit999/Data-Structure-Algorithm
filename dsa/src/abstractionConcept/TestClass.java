package abstractionConcept;

public class TestClass {

	public static void main(String[] args) {
				HDFCBank b = new HDFCBank();
				
		// method overriding
		b.loan();
		b.credit();
		b.debit(); // overridden 
		b.funds();
		
		// dynamic polymorphism, top casting
		
		// object of HDFCBank refered by bank class interface
		Bank bank = new HDFCBank();
		bank.credit();
		bank.loan();
//		bank.funds - we cannot access funds here
		
		
// 		we cannot create objects of abstract class
//		Bank b2 = new Bank();

	}

}
