package binaryTree;

import java.util.ArrayList;

public class RootToNodePath {
	
	public static ArrayList<Integer> rootToNodePathBST(BinaryTreeNode<Integer> root, int x){
		//base case
		if(root == null) {
			return null;
		}
		
		if(root.data == x) {
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		
		if(root.data < x) {
			ArrayList<Integer> rightOutput = rootToNodePathBST(root.right, x);
			if(rightOutput != null) {
				rightOutput.add(root.data);
				return rightOutput;
			}
		}
		
		ArrayList<Integer> leftOutput = rootToNodePathBST(root.left, x);
		if(leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		
		// if not found at root position, then compare with x choose leftSubTree or rightSubTree
		//then if not found in respective subTree -> return null
		return null;
	}

	public static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root, int x){
		//base case
		if(root == null) {
			return null;
		}
		
		if(root.data == x) {
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> leftOutput = rootToNodePath(root.left, x);
		if(leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		
		ArrayList<Integer> rightOutput = rootToNodePath(root.right, x);
		if(rightOutput != null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		
		// if not found at root position, then leftSubTree and then rightSubTree -> return null i.e. x not found
		return null;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakePrintInputLevelWise.takeInputLevelWise();
		ArrayList<Integer> path= rootToNodePathBST(root,7);
//		System.out.println(path);
		
		if(path == null) {
			System.out.println("x not found");
		}else {
			for(int item : path) {
				System.out.print(item + " ");
			}
		}
	}

}
