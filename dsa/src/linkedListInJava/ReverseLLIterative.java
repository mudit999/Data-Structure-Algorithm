package linkedListInJava;

public class ReverseLLIterative {

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
				count++;
				temp = temp.next;
			}
			System.out.print(temp.data + " ");
		}
	}
	
	public static void main(String[] args) {
		
	}

}
