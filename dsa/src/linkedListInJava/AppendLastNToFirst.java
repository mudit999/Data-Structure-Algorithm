package linkedListInJava;

public class AppendLastNToFirst {

	public static Node<Integer> appendLastN(Node<Integer> head,int n ) {
			Node<Integer> temp = head;
			Node<Integer> prevTail = head;
        	Node<Integer> newHead = head;


	        int count = 0;
	        while(temp != null){
	            if(temp.next == null){
	            	prevTail = temp;
	            }
	            count++;
	            temp = temp.next;
	        }
	        
	        if( n == 0 || n >= count || head == null){
	            return head;
	        }
        
            // iterate to sizeLL-n-1 position
            int ithMinusOne = count - n - 1;
            int pos = 0;
			temp = head;

			// IMP: Mistake - here while loop was infinite earlier, so make it pos++			
            while(temp != null && pos < ithMinusOne){
            	pos++;
            	temp = temp.next;
            }
            
            if(temp != null) {
                // newHead
            	newHead = temp.next;
                // connection broken
                temp.next = null;
            }
            prevTail.next = head;
            return newHead;
	}
	
	public static void removeIt(Node<Integer> head) {
		Node<Integer> t1 = head;
		Node<Integer> t2 = head.next;
		
		while(t2 != null) {
			if(t1.data != t2.data) {
				t1 = t2;
				t2 = t1.next;
			}else {
					while(t2 != null && t1.data == t2.data) {
						t2 = t2.next;
					}
					// make connection
					t1.next = t2;
					
					// update t1 and t2 position
					if(t2 != null) {
						t1 = t2;
						t2 = t1.next;
					}
			}
		}
	}
	
	public static void removeItOptimized(Node<Integer> head) {
		if(head == null || head.next == null) {
			return;
		}
		
		Node<Integer> t1 = head;
		Node<Integer> t2 = head.next;
		
		while(t2 != null) {
			if(t1.data.equals(t2.data)) {
				t2 = t2.next;
			}else {
				// create connection
				t1.next = t2;
				
				// place t1 and t2 at right place
				t1 = t2;
				t2 = t1.next;
			}
		}
		t1.next = t2;
	}
	
	public static Node<Integer> createLinkedList() {
		Node<Integer> n1 = new Node<>(1);
		Node<Integer> n2 = new Node<>(1);
		Node<Integer> n3 = new Node<>(4);
		Node<Integer> n4 = new Node<>(4);
		Node<Integer> n5 = new Node<>(4);
		Node<Integer> n6 = new Node<>(489898983);
		Node<Integer> n7 = new Node<>(332322224);
		Node<Integer> n8 = new Node<>(42222);
		Node<Integer> n9 = new Node<>(42222);
		Node<Integer> n10 = new Node<>(4);


		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
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
//		head = appendLastN(head, 9);
//		printLL(head);
		removeItOptimized(head);
		printLL(head);
	}

}
