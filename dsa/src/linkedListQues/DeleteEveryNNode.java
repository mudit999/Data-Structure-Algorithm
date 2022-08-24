package linkedListQues;

import linkedListInJava.Node;
import linkedListInJava.TakingLLInputUser;

public class DeleteEveryNNode {
	
	public static Node<Integer> deleteEveryNNode(Node<Integer> head, int m, int n){
		if(m == 0) {
			return null;
		}
		
		if(m == 0 && n == 0) {
			return head;
		}
		
		if(n == 0) {
			return head;
		}
		
		Node<Integer> t1 = head;
		Node<Integer> t2 = head;
		int countM = 1;
		int countN = 1;
		
		while(t1 != null && t2 !=null) {
			while(t1 != null && countM != m) {
				countM++;
				t1 = t1.next;
			}
			
			if(t1 != null) {
				t2 = t1.next;
			}
			while(t2 != null && countN != n) {
				countN++;
				t2 = t2.next;
			}
			
			if(t2 != null && t1 != null) {
				t2 = t2.next;
				t1.next = t2;
				t1 = t2;
			}else {
				if(t1 != null) {
					t1.next = null;

				}
				return head;
			}
			
			countM = 1;
			countN = 1;
		}
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = TakingLLInputUser.takeInput();
		Node.printLL(head);
		System.out.println();
		head = deleteEveryNNode(head,0,1);
		Node.printLL(head);
	}
}