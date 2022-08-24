package linkedListInJava;

public class DeleteAtInLL {

	public static Node<Integer> DeleteAt(Node<Integer> head, int i){
		Node<Integer> temp = head;

		if(i == 0) {
			head = temp.next;
			return head;
		}else {
			int position = 0;			
			while(temp != null & position < i-1) {
				position++;
				temp = temp.next;
			}
			
			if(temp!=null && temp.next!=null) {
				temp.next = temp.next.next;
			}
			return head;
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
		head = DeleteAt(head, 1);
		printLL(head);
	}

}
