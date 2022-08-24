package linkedListQues;

// Ques: https://www.youtube.com/watch?v=ws8hmOpxdIM

import linkedListInJava.Node;
import linkedListInJava.TakingLLInputUser;

public class Swap2NodeLL {
	
	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
		Node<Integer> temp = head;
		Node<Integer> p1 = null;
		Node<Integer> p2 = null;
		Node<Integer> c1 = null;
		Node<Integer> c2 = null;
		Node<Integer> t1 = null;
	
		int index = 0;
		while(temp != null) {
			
			if(index == i-1) {
				p1 = temp;
				System.out.println(p1.data);
				c1 = p1.next;
			}
			
			if(index == j-1) {
				p2 = temp;
				System.out.println(p2.data);
				c2 = p2.next;
			}
			index++;
			temp = temp.next;
		}
		
		p1.next = c2;
		p2.next = c1;
		t1 = c1.next;
		c1.next = c2.next;
		c2.next = t1;
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = TakingLLInputUser.takeInput();
		Node.printLL(head);
		System.out.println();
		int i = 1;
		int j = 4;
		head = swapNodes(head, i, j);
		Node.printLL(head);
	}
}