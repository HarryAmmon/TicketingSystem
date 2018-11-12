
public class Main {

	public static void main(String[] args) {		
		LinkedList tickets = new LinkedList();
		/*
		 * Creates 8 tickets
		 */
		Ticket[] quickTickets = new Ticket[8];
		quickTickets[6] = new Ticket("Tyler", "Lauren", 4);
		quickTickets[0] = new Ticket("Andy", "Harry", 1);
		quickTickets[2] = new Ticket("Steffi", "Lauren", 2);
		quickTickets[3] = new Ticket("James", "Jack", 2);
		quickTickets[5] = new Ticket("Brandon", "Matt", 3);		
		quickTickets[5] = new Ticket("Brandon", "Matt", 3);
		quickTickets[3] = new Ticket("James", "Jack", 2);
		quickTickets[7] = new Ticket("Felix", "Jack", 4);
		quickTickets[4] = new Ticket("George", "Harry", 3);
		quickTickets[1] = new Ticket("Alex", "Matt", 1);
		/*
		 * Populates the linked list with these tickets
		 * Shows the linked list
		 */
		for (int a = 0; a < quickTickets.length; a++) {
			tickets.add(new Node(quickTickets[a]));
		}
		
		System.out.println("These tickets have been created for demonstation purposes:");
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
		/*
		 * Add a new ticket
		 * Shows the linked list
		 */
		Ticket ticket1 = new Ticket("Harry","Andy",1);
		tickets.add(new Node(ticket1));

		System.out.println("Below a ticket with priority 1 has been added");
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
		/*
		 * Add a new ticket
		 * Shows the linked list
		 */
		Ticket ticket2 = new Ticket("John","Jake",2);
		tickets.add(new Node(ticket2));
		
		System.out.println("Below a ticket with priority 2 has been added");
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
		/*
		 * Add a new ticket
		 * Shows the linked list
		 */
		Ticket ticket3 = new Ticket("John","Jake",3);
		tickets.add(new Node(ticket3));
		System.out.println("Below a ticket with priority 3 has been added");
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
		/*
		 * Add a new ticket
		 * Shows the linked list
		 */
		Ticket ticket4 = new Ticket("Michelle","Alex",4);
		tickets.add(new Node(ticket4));
	
		System.out.println("Below a ticket with priority 3 has been added");
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
		/*
		 * Removes an item from the linked list
		 * Shows the linked list
		 */
		System.out.println("A ticket with ID: "+tickets.get(5).getData().getID()+" has been removed from the list");
		tickets.remove(tickets.get(5).getData().getID());
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
		
		/*
		 * Changes the priority of an item in the linked list
		 * Shows the linked list
		 */
		System.out.println("Ticket with ID "+tickets.get(6).getData().getID()+" has had its priority changed from "+tickets.get(6).getData().getPriority()+" to 3");
		tickets.changePriority(tickets.get(6).getData().getID(), 3);
		
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
		/*
		 * Changes the priority of an item in the linked list
		 * Shows the linked list
		 */
		System.out.println("Ticket with ID "+tickets.get(3).getData().getID()+" has had its priority changed from "+tickets.get(3).getData().getPriority()+" to 2");
		tickets.changePriority(tickets.get(3).getData().getID(), 2);
		
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
		/*
		 * Changes the priority of an item in the linked list
		 * Shows the linked list
		 */
		System.out.println("Ticket with ID "+tickets.get(7).getData().getID()+" has had its priority changed from "+tickets.get(7).getData().getPriority()+" to 1");
		tickets.changePriority(tickets.get(7).getData().getID(), 1);
		
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
		/*
		 * Changes the priority of an item in the linked list
		 * Shows the linked list
		 */
		System.out.println("Ticket with ID "+tickets.get(9).getData().getID()+" has had its priority changed from "+tickets.get(9).getData().getPriority()+" to 4");
		tickets.changePriority(tickets.get(9).getData().getID(), 4);
		
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
		
		/*
		 * Returns the last item from the list
		 */
		System.out.println("The pop function will remove and return the last item in the list "+tickets.pop());
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
	}
}
