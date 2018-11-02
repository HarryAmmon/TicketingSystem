
public class Main {

	public static void main(String[] args) {
		/*
		 * Creates a new linked list
		 */
		LinkedList tickets = new LinkedList(); 
		/*
		 * Creates 8 quickTickets, 2 of each priority
		 * This is testing purposes only
		 */
		
		Ticket[] quickTickets = new Ticket[8];
		quickTickets[0] = new Ticket("Andy", "Harry", 1);
		quickTickets[1] = new Ticket("Alex", "Matt", 1);
		quickTickets[2] = new Ticket("Steffi", "Lauren", 2);
		quickTickets[3] = new Ticket("James", "Jack", 2);
		quickTickets[4] = new Ticket("George","Harry", 3);
		quickTickets[5] = new Ticket("Brandon", "Matt", 3);
		quickTickets[6] = new Ticket("Tyler", "Lauren", 4);
		quickTickets[7] = new Ticket("Felix", "Jack",4);
		
		/*
		 * Add these quickTickets to the linked list
		 */
		for (int i = 0;i<quickTickets.length;i++) {
			System.out.println(i);
			tickets.add(new Node(quickTickets[i]));
		}
		for (int i = 0;i<quickTickets.length;i++) {
			System.out.println(tickets.getAllData()[i]);
		}
	}

}
