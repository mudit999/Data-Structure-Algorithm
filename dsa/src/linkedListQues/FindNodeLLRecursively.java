package linkedListQues;

import linkedListInJava.Node;
import linkedListInJava.TakingLLInputUser;

public class FindNodeLLRecursively {

	public static int findNodeRec(Node<Integer> head, int n) {
    	//Your code goes here
        // base
        if(head == null){
            return -1;
        }
        
        if(head.data == n){
            return 0;
        }
        int index = findNodeRec(head.next, n);
        if(index == -1) {
        	return -1;
        }else {
            return index+1;
        }
	}
	
	public static void main(String[] args) {
		Node<Integer> head = TakingLLInputUser.takeInput();
//		Node.printLL(head);
		System.out.println();
		int ans = findNodeRec(head, 2);
		System.out.println(ans);
	}

}
