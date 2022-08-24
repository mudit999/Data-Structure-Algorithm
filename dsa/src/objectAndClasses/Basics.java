package objectAndClasses;
import java.util.Scanner;

class Student{
	String name;
	private int rollNumber;
	final static double CONVERSION_FACTOR = 0.98;
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	// Default constructor
//	public Student() {
//		System.out.println("Deafult constructor called");
//	}
	
	// Own Constructor
	
	public Student(String name) {
		this.name = name;
		System.out.println("cionstrnfvjfn");
	}
	
	public Student(String name, int rollNumber) {
		this("Negi");
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public void setRollNumber(int rollNumber) {
		if(rollNumber <= 0) {
			return;
		}
		this.rollNumber = rollNumber;
		System.out.println(this);
	}
}

public class Basics {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Student s1 = new Student("Rohit", 33);
		System.out.println(s1.CONVERSION_FACTOR);		
		System.out.println(Student.CONVERSION_FACTOR);
		
//		System.out.println("s1" + " " + s1);
//		s1.setRollNumber(77);
//		System.out.println(s1.getRollNumber());
//		Student s2 = new Student();
		
		System.out.println(s1.name + " " + s1.getRollNumber());
	}
}