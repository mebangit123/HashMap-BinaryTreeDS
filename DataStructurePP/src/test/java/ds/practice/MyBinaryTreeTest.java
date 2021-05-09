package ds.practice;

import org.junit.Assert;
import org.junit.Test;
public class MyBinaryTreeTest {
@Test
public void given3NumbersWhenAddedToBSTShouldReturnSize3() {
	MyBinaryTree<Integer> myBinary = new MyBinaryTree<>();
		myBinary.add(56);
		myBinary.add(30);
		myBinary.add(70);
	int size = myBinary.getSize();
	Assert.assertEquals(3,  size);
}
}
