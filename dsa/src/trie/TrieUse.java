package trie;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie = new Trie();
		trie.add("at");
		trie.add("news");
		trie.add("this");
		trie.add("this");
		trie.add("this");
		trie.add("this");
		trie.add("this");
		trie.add("this");
		trie.add("this");

//		System.out.println(trie.search("this"));

//		trie.remove("this");
//		System.out.println(trie.search("this"));
		
		System.out.println(TrieNode.wordCount);
		
//		System.out.println(trie.search("mudit"));
	}

}
