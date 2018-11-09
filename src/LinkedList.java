import java.util.Random;

public class LinkedList {
	public Node head;
	private int length;

	/**
	 * Constructor
	 */
	public LinkedList() {
		length = 0;
	}

	/**
	 * @return length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Removes and returns the last node in the list
	 * 
	 * @return last node
	 */
	public Node pop() {
		Node currentNode = head;
		Node temp = null;
		while (currentNode.getNext() != null) {
			temp = currentNode;
			currentNode = currentNode.getNext();
		}
		temp.updatePointer(null);
		length--;
		return currentNode;
	}

	/**
	 * 
	 * @param Node n
	 * @return true when node is added
	 */
	public boolean push(Node n) {
		if (createID(n)) {
			n.updatePointer(head);
			head = n;
			length++;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Adds node to the back of the queue
	 * 
	 * @param Node n
	 * @return true is was added successfully, else if not
	 */

	public boolean addBetter(Node n) {
		Node currentNode = head;
		if (createID(n)) {
			n.updatePointer(currentNode);
			head = n;
			length++;
			return true;
		} else
			return false;
	}

	@SuppressWarnings(value = { "static-access" })
	public String getAllData(int i) {
		String data = "";
		data = data.format("|%7d|%10s|%10s|%1s", this.get(i).getID(), this.get(i).getOwner(), this.get(i).getCreator(),
				this.get(i).getPriority());
		return data;
	}

	public Ticket get(int j) {
		Node currentNode = head;
		for (int i = 0; i < j; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}

	/**
	 * Creates and assigns a unique ID to the ticket Will keep trying to assign an
	 * ID until a unique ID is found
	 * 
	 * @param n
	 * @return true if successful
	 */
	private boolean createID(Node n) {
		Random rand = new Random();
		int ID = rand.nextInt(99999) + 10000; // Generates a random ID
		if (!containsID(ID)) { // Checks to see if the ID is already been used
			n.getData().setID(ID);
			return true;
		} else {
			return createID(n);
		}
	}

	/**
	 * Checks to see if ID is already used
	 * 
	 * @param ID
	 * @return true if ID has been used, false if not
	 */
	private boolean containsID(int value) {
		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.getData().getID() == value) {
				return true;
			}
			currentNode = currentNode.getNext();
		}
		return false;
	}

	public boolean add(Node n) {
		Node currentNode = head;
		boolean added = false;
		if (createID(n)) {
			// If list is empty
			if (head == null) {
				head = n;
				length++;
				return true;
			}
			if (n.getData().getPriority() >= head.getData().getPriority()) {
				n.updatePointer(head);
				head = n;
				length++;
				return true;
			}

			while (!added) {
				if (currentNode.getData().getPriority() <= n.getData().getPriority()
						&& currentNode.getNext().getData().getPriority() <= n.getData().getPriority()) {
					n.updatePointer(currentNode.getNext());
					currentNode.updatePointer(n);
					length++;
					added = true;
				} else {
					currentNode = currentNode.getNext();
				}
			}
			return added;
		}
		return false;

	}
}
