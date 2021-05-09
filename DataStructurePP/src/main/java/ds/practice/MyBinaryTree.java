package ds.practice;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if(current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0) return current;
		if(compareResult < 0 ) {
			current.left = addRecursively(current.left, key);
		}else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}
	public int getSize() {
		return this.getSizeRecursive(root);
	}
	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
									   + this.getSizeRecursive(current.right);
	}
	public static void main(String[] args) {
		MyBinaryTree<Integer> myBinary = new MyBinaryTree<>();
		myBinary.add(56);
		myBinary.add(30);
		myBinary.add(22);
		myBinary.add(11);
		myBinary.add(3);
		myBinary.add(16);
		myBinary.add(40);
		myBinary.add(60);
		myBinary.add(95);
		myBinary.add(65);
		myBinary.add(63);
		myBinary.add(76);
		
	int size = myBinary.getSize();	
	System.out.println(size);
	}

}
class MyBinaryNode<K extends Comparable<K>> {
	K key;
	MyBinaryNode<K> left;
	MyBinaryNode<K> right;
	public MyBinaryNode(K key) {
		super();
		this.key = key;
		this.left = null;
		this.right = null;
	}
}