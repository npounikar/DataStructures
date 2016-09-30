
public class BSTNode {

	int data;
	BSTNode leftChild;
	BSTNode rightChild;
	
	BSTNode() {
		data = 0;
		leftChild = null;
		rightChild = null;
	}
	
	BSTNode(int data) {
		this.data = data;
		leftChild = null;
		rightChild = null;
	}
	
	public int getData() {
		return this.data;
	}
	

	public void setData(int data) {
		this.data = data;
	}
}
