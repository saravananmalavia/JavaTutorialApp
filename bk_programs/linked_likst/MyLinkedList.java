package sales;

public class MyLinkedList {

	private MyLinkedListNode head;

	private int size;

	public int getSize() {
		return this.size;
	}

	public void add(Product product) {
		MyLinkedListNode node = new MyLinkedListNode(product);
		if (head == null) {
			head = node;
		} else {
			MyLinkedListNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		size++;
	}

	public Product get(int position) {
		if (size <= position) {
			return null;
		} else {
			MyLinkedListNode temp = head;
			for (int i = 0; i < position; i++) {
				temp = temp.next;
			}
			return temp.data;
		}
	}

}










class MyLinkedListNode {
	Product data;
	MyLinkedListNode next;

	public MyLinkedListNode(Product data) {
		super();
		this.data = data;
	}

}
