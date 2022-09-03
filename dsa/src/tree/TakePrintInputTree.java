package tree;

import java.util.Scanner;

public class TakePrintInputTree {

	public static TreeNode<Integer> takeInput(Scanner scan){
		System.out.println("Enter next node data: ");
		int n = scan.nextInt();
		
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		
		System.out.println("Enter child of: " + n);
		int childCount = scan.nextInt();
		
		for(int i = 0 ; i<childCount ; i++) {
			TreeNode<Integer> childRootNode = takeInput(scan);
			root.children.add(childRootNode);
		}
		return root;
	}
	
	public static void printTree(TreeNode<Integer> root) {
		String s = root.data + ":";
		for(int i = 0 ; i<root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for(int i = 0 ; i<root.children.size(); i++) {
			printTree(root.children.get(i));
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeNode<Integer> root = takeInput(scan);
		printTree(root);
	}

}
