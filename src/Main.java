
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
		quickTickets[0] = new Ticket("Andy", "Harry", 4);
		quickTickets[1] = new Ticket("Alex", "Matt", 4);
		quickTickets[2] = new Ticket("Steffi", "Lauren", 3);
		quickTickets[3] = new Ticket("James", "Jack", 3);
		quickTickets[4] = new Ticket("George","Harry", 2);
		quickTickets[5] = new Ticket("Brandon", "Matt", 2);
		quickTickets[6] = new Ticket("Tyler", "Lauren", 1);
		quickTickets[7] = new Ticket("Felix", "Jack",1);
		System.out.println("Tickets have been created");
		/*
		 * Add these quickTickets to the linked list
		 */
		System.out.println("Quick ticket length: " +quickTickets.length);
		
		for (int a = 0;a<quickTickets.length;a++) {
			System.out.println(a);
			tickets.add(new Node(quickTickets[a]));
		}
		System.out.println("Tickets have been added to list");
		
		 
		 
		for (int i = 0;i<quickTickets.length;i++) {
			System.out.println(tickets.get(i).getID());
		}

	}

}
