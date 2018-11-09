
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
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		System.out.println();
		
		/*Ticket ticket1 = new Ticket("Harry","Andy",1);
		tickets.add(new Node(ticket1));*/			
		
		tickets.remove(tickets.get(5).getData().getID());
		
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		
		/*Ticket ticket2 = new Ticket("Harry","Andy",2);
		if(tickets.addBest(new Node(ticket2))){
			System.out.println("Node added");
		}
		
		Ticket ticket3 = new Ticket("Harry","Andy",3);
		if(tickets.addBest(new Node(ticket3))){
			System.out.println("Node added");
		}
		
		Ticket ticket4 = new Ticket("Harry","Andy",4);
		if(tickets.addBest(new Node(ticket4))){
			System.out.println("Node added");
		}
		
		for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData(i));
		}
		
		System.out.println(tickets.pop().getData().getID());
		
		
		/*System.out.println("First node added");
		System.out.println(tickets.get(0).getPriority()+"\n");
		
		Ticket ticket2 = new Ticket("Steve","Dave",1);
		tickets.addBest(new Node(ticket2));
		
		/*Ticket ticket3 = new Ticket("Steve","Dave",4);
		tickets.addBest(new Node(ticket3));*/
		
		/*for (int i = 0; i<tickets.getLength();i++) {
			System.out.println(tickets.getAllData()[i].getPriority());
		}*/
	}
	

}
