package practice;

import java.util.ArrayList;
import java.util.Scanner;

class TreeNode<T>{
	public T data;
	public ArrayList<TreeNode<T>> children;
	
	public TreeNode(T data) {
		this.data = data;
		children = new ArrayList<>();
	}
}

public class Generic_Tree_Revision {
	
	public static TreeNode<Integer> takeInput(Scanner scan){
		System.out.println("Enter next node data");
		int data = scan.nextInt();
		
		TreeNode<Integer> root = new TreeNode<>(data);
		
		System.out.println("Enter child count of " + data);
		int childcount = scan.nextInt();
		
		for(int i = 0; i<childcount; i++) {
			TreeNode<Integer> childRoot = takeInput(scan);
			root.children.add(childRoot);
		}
		return root;
	}
	
	public static void printTree(TreeNode<Integer> root) {
		String s = root.data + ": ";
		
		// traverse children of root
		for(int i = 0; i<root.children.size(); i++) {
			s = s + root.children.get(i).data + ", ";
		}
		System.out.println(s);
		
		// pass every child of root in printTree
		for(int i = 0 ; i<root.children.size(); i++) {
			printTree(root.children.get(i));
		}
	}	

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		TreeNode<Integer> root = takeInput(scan);
		System.out.println();
		printTree(root);
	}

}