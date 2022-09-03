package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakePrintTreeLevelWise {

	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner scan = new Scanner(System.in);
		Queue<TreeNode<Integer>> pendingNodesQueue = new LinkedList<>();
		System.out.println("Enter root data");
			
		int rootData = scan.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodesQueue.add(root);
		
		while(!pendingNodesQueue.isEmpty()) {
			// dequeue front from queue
			TreeNode<Integer> frontNode = pendingNodesQueue.poll();
			
			// ask for num of child nodes of frontNode
			System.out.println("Enter num of children of " + frontNode.data);
			int childCount = scan.nextInt();
			
			// for every children -> ask data, create node, link with front and enqueue in pendingNodesQueue
			for(int i = 0 ; i<childCount; i++) {
				System.out.println("Enter " + (i+1) + "th child of " + frontNode.data);
				int childData = scan.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(childData);
				pendingNodesQueue.add(childNode);
				frontNode.children.add(childNode);			
			}
		}
		return root;
	}
	
	public static void printTreeLevelWise(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>> pendingNodesQueue = new LinkedList<>();
		pendingNodesQueue.add(root);
		
		while(!pendingNodesQueue.isEmpty()) {
			// dequeue front from queue
			TreeNode<Integer> frontNode = pendingNodesQueue.poll();
			System.out.print(frontNode.data + ": ");
			
			for(int i = 0; i < frontNode.children.size(); i++){
				System.out.print(frontNode.children.get(i).data + ", ");
				pendingNodesQueue.add(frontNode.children.get(i));
			}
		}
		System.out.println();
	}
	
	public static void printTreeLevelWiseCN(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>> pendingNodesQueue = new LinkedList<>();
		pendingNodesQueue.add(root);
		
		while(!pendingNodesQueue.isEmpty()) {
				int queueSize = pendingNodesQueue.size();
				
				// if queue has children
				while(queueSize > 0) {
					// dequeue front from queue
					TreeNode<Integer> frontNode = pendingNodesQueue.poll();
					System.out.print(frontNode.data + " ");
					
					// enqueue all the children of dequeued node
					for(int i = 0; i < frontNode.children.size(); i++){
						pendingNodesQueue.add(frontNode.children.get(i));
					}
				queueSize--;
			}
				
			// print new line b/w two levels
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		TreeNode<Integer> root = takeInputLevelWise();
		printTreeLevelWise(root);
	}

}
