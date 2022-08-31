package trees;

public class IsTreeBalanced {
	
	// used in isBST
	public static int heightOfTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int leftSubTreeHeight = heightOfTree(root.left);
		int rightSubTreeHeight = heightOfTree(root.right);
		return 1 + Math.max(leftSubTreeHeight, rightSubTreeHeight);
	}
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
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
		boolean isLeftSubTreeBalanced = isBST(root.left);
		boolean isRightSubTreeBalanced = isBST(root.right);
		
		return isLeftSubTreeBalanced && isRightSubTreeBalanced;
	}
	
	public static IsBSTReturn isBSTBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			int height = 0;
			boolean isBST = true;
			IsBSTReturn ans = new IsBSTReturn(height,isBST);
			return ans;
		}
		
		// IH
		IsBSTReturn leftAns = isBSTBetter(root.left);
		IsBSTReturn rightAns = isBSTBetter(root.right);
		
		// IS
		boolean isBST = true;
		int height = 1 + Math.max(leftAns.height, rightAns.height);
		
		if(Math.abs(leftAns.height - rightAns.height) > 1) {
			isBST = false;
		}
		
		if(!leftAns.isBST || !rightAns.isBST) {
			isBST = false;
		}
		
		IsBSTReturn ans = new IsBSTReturn(height,isBST);
		return ans;
	}
	
	// used in isBST2
	public static int maximum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int leftSubTree = maximum(root.left);
		int rightSubTree = maximum(root.right);
		
		return Math.max(root.data, Math.max(leftSubTree, rightSubTree));
	}
	
	// used in isBST2
	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int leftSubTree = minimum(root.left);
		int rightSubTree = minimum(root.right);
		
		return Math.min(root.data, Math.min(leftSubTree, rightSubTree));
	}
	
	public static boolean isBST2(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		
		int maxLeftSide = maximum(root.left);
		if(maxLeftSide > root.data) {
			return false;
		}
		
		int minRightSide = minimum(root.right);
		if(minRightSide < root.data) {
			return false;
		}
		boolean leftSubTreeBal = isBST2(root.left);
		boolean rightSubTreeBal = isBST2(root.right);
		
		return leftSubTreeBal && rightSubTreeBal;
	}
	
	public static IsBST2Return isBST2Better(BinaryTreeNode<Integer> root) {
		if(root == null) {
			IsBST2Return ans =  new IsBST2Return(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return ans;
		}
		
		IsBST2Return leftAns = isBST2Better(root.left);
		IsBST2Return rightAns = isBST2Better(root.right);
		
		int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
		int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
		boolean isBST = true;
		
		if(leftAns.max >= root.data) {
			isBST = false;
		}
		
		if(rightAns.min < root.data) {
			isBST = false;
		}
		
		if(!leftAns.isBST || !rightAns.isBST) {
			isBST = false;
		}
		
		IsBST2Return ans =  new IsBST2Return(min, max, isBST);
		return ans;
	}
	
	public static boolean isBST3(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
		if(root == null) {
			return true;
		}
		
		if(root.data < minRange || root.data > maxRange) {
			return false;
		}
		
		boolean isLeftWithinRange = isBST3(root.left, minRange, root.data-1);
		boolean isRightWithinRange = isBST3(root.right, root.data, maxRange);
		return isLeftWithinRange && isRightWithinRange;

	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true,0,true);
		IsBST2Return ans = isBST2Better(root);
		System.out.println(ans.min + " " +  ans.max + " " + ans.isBST);
		System.out.println(isBST3(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

}