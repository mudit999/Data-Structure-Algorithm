package trees;

public class TreeBalancedOrNot {
	
	public static int heightOfTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int leftSubTreeHeight = heightOfTree(root.left);
		int rightSubTreeHeight = heightOfTree(root.right);
		return 1 + leftSubTreeHeight + rightSubTreeHeight;
	}
	
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			int height = 0;
			boolean isBal = true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}
		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
		boolean isBal = true;
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);
		
		if(Math.abs(leftOutput.height - rightOutput.height) > 1) {
			isBal = false;
		}
		
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
	}

	public static boolean balancedOrNot(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		
		int leftSubTreeHeight = heightOfTree(root.left);
		int rightSubTreeHeight = heightOfTree(root.right);
		
		//if root not balanced return false
		if(Math.abs(leftSubTreeHeight - rightSubTreeHeight) > 1) {
			return false;
		}
		
		// here root is balanced
		// check for left and right subtree
		boolean isLeftSubTreeBalanced = balancedOrNot(root.left);
		boolean isRightSubTreeBalanced = balancedOrNot(root.right);
		
		return isLeftSubTreeBalanced && isRightSubTreeBalanced;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true,0,true);
//		System.out.println(balancedOrNot(root));
		System.out.println(isBalancedBetter(root).isBalanced);
	}

}