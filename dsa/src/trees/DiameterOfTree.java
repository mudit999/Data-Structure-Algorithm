package trees;

public class DiameterOfTree {
	
	

    public static int heightOfTree(BinaryTreeNode<Integer> root) {
        if(root == null) {
        	return 0;
    	}
	
		int leftSubTreeHeight = heightOfTree(root.left);
		int rightSubTreeHeight = heightOfTree(root.right);
		return 1 + Math.max(leftSubTreeHeight, rightSubTreeHeight);
    }
    
    public static DiameterOfTreeReturn diameterOfBinaryTreeBetter(BinaryTreeNode<Integer> root) {
    	// base case
    	if(root == null) {
    		int height = 0;
    		int diameter = 0;
    		DiameterOfTreeReturn d1 = new DiameterOfTreeReturn();
    		d1.height = height;
    		d1.diameter = diameter;
    		return d1;
    	}
    	
    	DiameterOfTreeReturn leftSubTreeD = diameterOfBinaryTreeBetter(root.left);
    	DiameterOfTreeReturn rightSubTreeD = diameterOfBinaryTreeBetter(root.right);
    	
    	int ansDiameter = Math.max(leftSubTreeD.height + rightSubTreeD.height + 1, Math.max(leftSubTreeD.diameter, rightSubTreeD.diameter));
		DiameterOfTreeReturn ansObj = new DiameterOfTreeReturn();
		ansObj.diameter = ansDiameter;
		ansObj.height = leftSubTreeD.height + rightSubTreeD.height + 1;
		return ansObj;
    }

	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
	    if(root == null){
	        return 0;
	    }
	    
	    int leftHeight = heightOfTree(root.left);
	    int rightHeight = heightOfTree(root.right);
	    
	    int leftDiameter = diameterOfBinaryTree(root.left);
	    int rightDiameter = diameterOfBinaryTree(root.right);
	    
	    return Math.max(leftHeight + rightHeight + 1,Math.max(leftDiameter,rightDiameter));
	}
	
	public static void main(String args[]) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true,0,true);
//		System.out.println(diameterOfBinaryTree(root));
		System.out.println(diameterOfBinaryTreeBetter(root).diameter);
	}

}
