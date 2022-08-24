package linkedListInJava;

public class InsertionInLL {
	
	public static Node<Integer> insertionAt(Node<Integer> head, int i, int iData){
		
		// new node - current
		Node<Integer> newNodeToBeCreated = new Node<Integer>(iData);
		
		if(i == 0) {
			// new head
			newNodeToBeCreated.next = head;
			head = newNodeToBeCreated;
			return head;
			
		}else {
			// traverse till i - 1 node
			int position = 0;
			Node<Integer> prevNode = head;
			while(prevNode != null && position < i-1 ) {
				position++;
				prevNode = prevNode.next;
			}
			
						
			if(prevNode!=null) {
				// make before you break
				newNodeToBeCreated.next = prevNode.next;
				prevNode.next = newNodeToBeCreated;
			}							
			return head;
		}
		

	}
	
	public static void reverseLL(Node<Integer> head) {
		Node<Integer> temp = head;
		int lenLL = 0;
		while(temp != null) {
			lenLL++;
			temp = temp.next;
		}
		
		for(int i = 1 ;i <= lenLL;i++) {
			int count = 0;
			temp = head;
			while(temp != null && count != lenLL-i) {
				temp = temp.next;
				count++;
			}
			if(temp != null) {
				System.out.print(temp.data + " ");
			}
		}
	}
	
	public static Node<Integer> createLinkedList() {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		Node<Integer> n5 = new Node<>(50);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		return n1;
	}
	
	public static void printLL(Node<Integer> head) {
	Node<Integer> temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head = createLinkedList();
		printLL(head);
		System.out.println();
//		head = insertionAt(head,2,80);
//		printLL(head);
		
		reverseLL(head);

	}

}
