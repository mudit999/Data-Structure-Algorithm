package trie;

public class Trie {
	private TrieNode root;

	public Trie() {
		// root node data - null character : '\0'
		root = new TrieNode('\0');
		// default
		// isTerminating false
		// all children all null 
		// childCount is 0 
	}

	// RECURSION
	
	// add operation
	public void add(String word) {
		add(root,word);
	}

	private void add(TrieNode root, String word) {

		// base case
		if(word.length() == 0) {
			root.isTerminating = true;
			TrieNode.wordCount++;
			return;
		}

		// childIndex
		int childIndex = word.charAt(0) - 'a';
		// getting child TrieNode from it's index
		TrieNode child = root.children[childIndex];

		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child; 
			root.childCount++;
		}

		add(child, word.substring(1));
	}

	// search operation
	public boolean search(String word) {
		boolean ans = search(root,word);
		return ans;
	}

	private boolean search(TrieNode root, String word) {

		// base case
		if(word.length() == 0) {
			return root.isTerminating;
		}

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child != null) {
			// if child found -> search for next char
			return search(child,word.substring(1));
		}else {
			return false;
		}
	}

	// remove operation
	public void remove(String word) {
		remove(root, word);
	}
	
	public void remove(TrieNode root, String word) {
		
		// base
		if(word.length() == 0) {
			root.isTerminating = false;
			TrieNode.wordCount--;
			return;
		}
		
		// IS
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return;
		}
	
		// IH
		// if not null, remove child
		remove(child,word.substring(1));
		
		// Memory Optimization
		// can we remove child from memory?
		// we can remove child node from memory when it is non terminating and no. of children is 0
		
		if(!child.isTerminating && child.childCount == 0) {
			root.children[childIndex] = null;
			child = null;
		}
		
		
		
//		if(!child.isTerminating) {
//			// In child node, go to children array and check if there is any child present, maintain count  
//			int noChildNode = 0;
//			
//			for(int i = 0 ; i<26; i++) {
//				if(child.children[i] != null) {
//					noChildNode++;
//				}
//			}
//			
//			if(noChildNode == 0) {
//				// we can delete child
//				root.children[childIndex] = null;
//				child = null; // not required
//			}
//		}
	}
}