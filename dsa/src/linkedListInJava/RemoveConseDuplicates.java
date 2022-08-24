package linkedListInJava;

public class RemoveConseDuplicates {

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
	
	public static void main(String[] args) {
		

	}

}
