package trie;

class TrieNodeP{
	char data;
	TrieNodeP[] children;
	boolean isTerminating;
	
	public TrieNodeP(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNodeP[26];
	}
}

public class TriePractice {
	
	private TrieNodeP root;
	
	public TriePractice() {
		root = new TrieNodeP('\0');
	}
	
	public void add(String word) {
		add(root,word);
	}
	
	public void add(TrieNodeP root, String word) {
		// base condition
		if(word.length() == 0) {
			root.isTerminating = true;
			return;
		}
		
		// get child Index
		int childIndex = word.charAt(0) - 'a';
		TrieNodeP child = root.children[childIndex];
		
		if(child == null) {
			child = new TrieNodeP(word.charAt(0));
			root.children[childIndex] = child;
		}
		
		add(root, word.substring(1));
		
	}
}