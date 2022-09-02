package tree;

import java.util.ArrayList;

public class TreeNode<T> {
	T data;
	ArrayList<TreeNode<T>> children;
	
	// constructor
	public TreeNode(T data) {
		this.data = data;
		children = new ArrayList<>();
	}
}