package binaryTree;

public class SearchInBst {

	public static boolean searchInBst(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return false;
		}
		
		if(root.data == k) {
			return true;
		}
		
		if(k < root.data) {
			return searchInBst(root.left,k);
		}else{
			return searchInBst(root.right,k);
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakePrintInputLevelWise.takeInputLevelWise();
		System.out.println(searchInBst(root,9));
	}

}
