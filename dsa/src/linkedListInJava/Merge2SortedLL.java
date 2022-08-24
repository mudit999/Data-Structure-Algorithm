package linkedListInJava;

public class Merge2SortedLL {

	public static Node<Integer> merge2SortedLL(Node<Integer> l1, Node<Integer> l2){
		
		// if both LL are null
		if(l1 == null && l2 == null){
            return null;
        }
        
		// if one of them is null
        if(l1 == null){
            return l2;
        }
        
        if(l2 == null){
            return l1;
        }
		
        // if both list contains elements
		Node<Integer> head;
		Node<Integer> tail;
		
		// initially setting up head, tail, l1 or l2
		if(l1.data > l2.data) {
			head = l2;
			tail = l2;
			l2 = l2.next;
		}else {
			head = l1;
			tail = l1;
			l1 = l1.next;
		}
		
		while(l1 != null && l2 != null) {
			if(l1.data > l2.data) {
				tail.next = l2;
				tail = l2;
				l2 = l2.next;
			}else {
				tail.next = l1;
				tail = l1;
				l1 = l1.next;
			}
		}
		
		// after traversal of l1 or l2, if any one of 2 LL get null
		if(l1 == null) {
			// l2 is remaining
			tail.next = l2;
		}else {
			tail.next = l1;
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
		Node<Integer> l1 = TakingLLInputUser.takeInput();
		Node<Integer> l2 = TakingLLInputUser.takeInput();
		printLL(l1);
		System.out.println();
		printLL(l2);
		System.out.println();

		Node<Integer> head = merge2SortedLL(l1,l2);
		printLL(head);
	}

}