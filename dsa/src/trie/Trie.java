package trie;

public class Trie {
	private TrieNode root;

	public Trie() {
		// root node data - null character : '\0'
		root = new TrieNode('\0');
		// default
		// isTerminating false
		// all children all null 
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
			return;
		}

		// childIndex
		int childIndex = word.charAt(0) - 'a';
		// getting child TrieNode from it's index
		TrieNode child = root.children[childIndex];

		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child; 
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
			return;
		}
		
		// IS
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return;
		}else {
			// IH
			remove(child,word.substring(1));
		}
	}
}