package linkedListQues;

import linkedListInJava.Node;
import linkedListInJava.TakingLLInputUser;

public class EvenAfterOddLL {

	public static Node<Integer> evenAfterOdd(Node<Integer> head){
		if(head == null) {
			return head;
		}
		
		Node<Integer> OH = null;
		Node<Integer> OT = null;
		Node<Integer> EH = null;
		Node<Integer> ET = null;
		
		Node<Integer> temp = head;
		while(temp != null) {
				// odd
			if(temp.data % 2 != 0) {
				if(OH == null) {
					OH = temp;
					OT = temp;
				}else {
					OT.next = temp;
					OT = temp;
				}

			}else {
				// even
				if(EH == null) {
					EH = temp;
					ET = temp;
				}else {
					ET.next = temp;
					ET = temp;
				}
			}
			temp = temp.next;
		}

		// all even
		if(OH == null) {
			ET.next = null;
			return EH;
		}else if(EH == null) {
			// all odd
			OT.next = null;
			return OH;
		}else {
			// mix
			OT.next = null;
			ET.next = null;
			OT.next = EH;
			return OH;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head = TakingLLInputUser.takeInput();
		Node.printLL(head);
		System.out.println();
		head = evenAfterOdd(head);
		Node.printLL(head);
	}

}
