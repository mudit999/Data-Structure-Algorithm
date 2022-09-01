package binaryTree;

public class BSTUse {

	public static void main(String[] args) {
		
		BST b = new BST();
		b.insert(5);
		b.insert(4);
		b.insert(3);
		b.insert(7);
		b.insert(8);
		b.insert(10);
		
		System.out.println(b.size());

		b.printTree();
		System.out.println(b.isPresent(5));
		System.out.println(b.deleteData(2));
		System.out.println(b.isPresent(5));

//		b.printTree();
//		System.out.println(b.deleteData(2));
//		b.printTree();
//		System.out.println(b.size());
	}
}