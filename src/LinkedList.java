import java.util.Random;

public class LinkedList {
	public Node head;
	private int length;

	/*
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
	 * Adds node to the back of the queue
	 * 
	 * @param Node n
	 * @return true is was added succesfully, else if not
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

	public boolean addBest(Node n) {
		Node currentNode = head;
		Node pointTo = after(n);
		
		boolean added = false;
		//while(!added) {
			if(createID(n)) {
				//If list is empty, insert the node and make that node the head
				if(head==null) { 
					head = n;
					length++;
					added=true;
				}
				// If the list length is 1,
				else if(getLength()==1) {
					// if (currentNode priority is higher or equal than the priority of the node to be added)
					if(currentNode.getData().getPriority() <= n.getData().getPriority()) {
						n.updatePointer(currentNode);
						head = n;
						length++;
						added = true;
					}
					else {
						head.updatePointer(n);
						length++;
						added = true;
					}
				}
				else if(getLength()>1) {
					// Was unable to find location to add new node to
					if(pointTo==n) {
						System.out.println("Unable to add node");
						return false;
					}
					else {
						while(!added) {
							if (currentNode.getNext() == pointTo) {
								n.updatePointer(currentNode.getNext());
								currentNode.updatePointer(n);
								length++;
								added = true;
							}
							else if(pointTo == head) {
								n.updatePointer(head);
								head=n;
								length++;
								added = true;
							}
							else {
								currentNode = currentNode.getNext();
							}
						}
					}
					added=true;
				}
				// If the priority of the current node is higher or equal to the added nodes priority
				//if(currentNode.getData().getPriority() <= n.getData().getPriority()) {}
		}
			else {
				added=false;
				}
		//}
		return added;
	}

	public void pop() {
		// Find the last item in the list
		// Find pointer to the last item
		// Remove the pointer
		Node currentNode = head;
		// Node last = null;
		// Find the last item
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		containsNode(currentNode).updatePointer(null);
		length--;
	}

	public String getAllData(int i) {
		String data = "";
		data = "ID: "+this.get(i).getID()+"::"+"Owner: "+this.get(i).getOwner()+"::"+"Creator: "+this.get(i).getCreator()+"::"+"Priority: "+this.get(i).getPriority()+"::";
		return data;
	}

	public Ticket get(int j) {
		Node currentNode = head;
		for (int i = 0; i < j; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}

	private boolean createID(Node n) {
		Random rand = new Random();
		int ID = rand.nextInt(99999) + 10000;
		if (!containsID(ID)) {
			n.getData().setID(ID);
			return true;
		} else {
			return false;
		}
	}

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
	 * Searches for pointer to node
	 * 
	 * @param n
	 * @return
	 */
	private Node containsNode(Node n) {
		Node currentNode = head;
		for (int i = 0; i < getLength(); i++) {
			if (currentNode.getNext() == n) {
				System.out.println("currentNode was returned! Had id: " + currentNode.getData().getID());
				return currentNode;
			} else {
				currentNode = currentNode.getNext();
			}
		}
		System.out.println("Node n returned");
		return n;
	}
	
	/**
	 * Will return the node that the new node should point to
	 * @param n
	 * @return
	 */
	private Node after(Node n) {
		Node currentNode = head;
		while(currentNode.getNext() != null) {
			if(currentNode.getData().getPriority() <= n.getData().getPriority()) {
				return currentNode;
			}
			else {
				currentNode = currentNode.getNext();
			}
		}
		return n;
	}
	
}
