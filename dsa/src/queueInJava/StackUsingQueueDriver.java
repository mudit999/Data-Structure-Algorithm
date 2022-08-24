package queueInJava;

public class StackUsingQueueDriver {

	public static void main(String[] args) {
		StackUsingQueues<Integer> s1 = new StackUsingQueues<>();
		s1.push(10);
		s1.push(30);
		s1.push(40);
		
		System.out.println(s1.size());
		System.out.println(s1.pop());
		System.out.println(s1.top());
		System.out.println(s1.size());
	}

}
