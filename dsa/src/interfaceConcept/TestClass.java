package interfaceConcept;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW bmw = new BMW();
		bmw.start();
		bmw.start();
		bmw.theftSafety();
		
		Car c = new BMW();
		c.stop();
//		c.theftSafety();   //cannot access it
	}

}
