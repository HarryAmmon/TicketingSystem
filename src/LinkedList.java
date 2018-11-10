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

	@SuppressWarnings(value = { "static-access" })
	public String getAllData(int i) {
		String data = "";
		data = data.format("|%7d|%10s|%10s|%1s", this.get(i).getData().getID(), this.get(i).getData().getOwner(),
				this.get(i).getData().getCreator(), this.get(i).getData().getPriority());
		return data;
	}

	public Node get(int j) {
		Node currentNode = head;
		for (int i = 0; i < j; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode;
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

	/**
	 * Adds node to the correct position in the linked list
	 * 
	 * @param n
	 * @return true if node was successfully added
	 */
	public boolean add(Node n) {
		Node currentNode = head;
		boolean added = false;
		if (n.getData().getID() == -1) {
			createID(n);
		}
		// If list is empty
		if (head == null) {
			head = n;
			length++;
			added = true;
		} else if (n.getData().getPriority() >= head.getData().getPriority()) {
			n.updatePointer(head);
			head = n;
			length++;
			added = true;
		}

		while (!added) {
			// if the priority of the node to be added is higher than or equal to the
			// current node &
			// if the priority of the node to be added is lower than or equal to the next
			// node
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

	/**
	 * Will remove the node that corresponds with the ID given
	 * 
	 * @param ID of node to be removed
	 * @return return the node that is removed
	 */

	public Node remove(int value) {
		Node currentNode = head;
		Node removed = null;
		int position = -1;
		for (int i = 0; i < length; i++) {
			if (this.get(i).getData().getID() == value) {
				position = i;
				removed = this.get(i);
			}
		}
		if (position == -1) {
			System.out.println("Unable to find node to remove");
		} else if (position == 0) {
			head = currentNode.getNext();
			length--;

		} else if (position + 1 == length) {
			this.get(position - 1).updatePointer(null);
			length--;
			// removed = true;
		} else {
			this.get(position - 1).updatePointer(this.get(position + 1));
			length--;
			// removed = true;
		}
		return removed;

	}

	/**
	 * This will change the priority of the node that contains ID
	 * Works by first removing the node from the list and then adding it as if it is a new node
	 * This will add it the correct place in the list
	 * @param i
	 * @param j
	 * @return true when successful
	 */
	public boolean changePriority(int i, int j) {
		Node removedNode = remove(i);
		Ticket reCreate = new Ticket(i,removedNode.getData().getCreator(),removedNode.getData().getOwner(),j);		
		add(new Node(reCreate));
		return true;
	}
}
