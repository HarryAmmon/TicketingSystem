public class LinkedList {
	public Node head;
	private int length;

	public LinkedList() {
		length = 0;
	}

	public int getLength() {
		return length;
	}

	public void add(Node n) {
		Node currentNode = head;
		boolean added = false;

		if (head == null) {
			head = n;
			added = true;
		}

		while (!added) {
			if (currentNode.getNext() == null) {
				currentNode.updatePointer(n);
				added = true;
			} else {
				currentNode = currentNode.getNext();
			}
		}
		length++;
	}

	public Ticket[] getAllData() {
		Node currentNode = head;
		Ticket data[] = new Ticket[length];
		for (int i = 0; i < length; i++) {
			data[i] = currentNode.getData();
			currentNode = currentNode.getNext();
		}
		return data;

	}

	public Ticket get(int j) {
		Node currentNode = head;
			for(int i = 0;i<j;i++) {
				currentNode = currentNode.getNext();
			}
			return currentNode.getData();
	}
	
	/*public boolean contains(String value) {
		Node currentNode = head;
		while(currentNode != null && currentNode.getData().getID() != value) {
			currentNode = currentNode.getNext();
		}
		if (currentNode==null) {
			return false;
		}
		return true;
	}*/
	
	public boolean contains(int value) {
		Node currentNode = head;
		while(currentNode != null && currentNode.getData().getID() != value) {
			currentNode = currentNode.getNext();
		}
		if (currentNode==null) {
			return false;
		}
		return true;
		
	}
}
