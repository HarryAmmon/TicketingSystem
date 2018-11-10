
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
		 */
		for (int a = 0; a < quickTickets.length; a++) {
			tickets.add(new Node(quickTickets[a]));
		}
		/*
		 *  Shows the linked list
		 */
		System.out.println("These tickets have been created for demonstation purposes:");
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
		/*
		 * Add a new ticket
		 */
		Ticket ticket1 = new Ticket("Harry","Andy",1);
		tickets.add(new Node(ticket1));
		/*
		 *  Shows the linked list
		 */
		System.out.println("Below a ticket with priority 1 has been added");
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
		/*
		 * Removes an item from the linked list
		 */
		tickets.remove(tickets.get(5).getData().getID());		
		/*
		 * Shows the linked list
		 */
		System.out.println("A ticket has been removed from the list");
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
	
		System.out.println("Ticket with ID "+tickets.get(6).getData().getID()+" has had its priority changed from "+tickets.get(6).getData().getPriority()+" to 3");
		
		/*
		 * Changes the priority of an item in the linked list
		 */
		tickets.changePriority(tickets.get(6).getData().getID(), 3);
		
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
