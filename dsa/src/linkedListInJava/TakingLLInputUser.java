package linkedListInJava;
import java.util.Scanner;

public class TakingLLInputUser {

	public static Node<Integer> takeInput(){
		Scanner scan = new Scanner(System.in);
		
		// first input
		int data = scan.nextInt();
		Node<Integer> head = null, tail = null;
		
		while(data != -1) {
			Node<Integer> currentNode = new Node<>(data);
			if(head == null) {
				head = currentNode; 
				tail = currentNode;
			}else {
//				Node<Integer> tail = head;
//				while(tail.next != null) {
//					tail = tail.next;
//				}
//				tail.next = currentNode;
				
				tail.next = currentNode;
				tail = tail.next; // or tail = currentNode
			}
			data = scan.nextInt();
		}
		return head;
	}
	
	public static void printLL(Node<Integer> head) {
	Node<Integer> temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		printLL(head);
	}

}
