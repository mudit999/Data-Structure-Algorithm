package trie;

public class TrieNode {
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;
	static int wordCount;
	
	// Contructor
	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];		// size - 26, by default - all children will be null 
		childCount = 0;
	}
}