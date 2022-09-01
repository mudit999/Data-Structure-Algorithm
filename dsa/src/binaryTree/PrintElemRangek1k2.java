package binaryTree;

public class PrintElemRangek1k2 {

	public static void printElemRangek1k2(BinaryTreeNode<Integer> root, int k1, int k2) {
		if(root == null) {
			return;
		}
		
		if(root.data < k1) {
			printElemRangek1k2(root.right,k1,k2);
		}
		
		if(root.data > k2) {
			printElemRangek1k2(root.left,k1,k2);
		}
		
		if(root.data >= k1 && root.data <= k2) {
			System.out.println(root.data);
			printElemRangek1k2(root.left,k1,k2);
			printElemRangek1k2(root.right,k1,k2);
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakePrintInputLevelWise.takeInputLevelWise();
		printElemRangek1k2(root, 6, 10);
	}

}
