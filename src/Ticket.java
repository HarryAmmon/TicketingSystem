public class Ticket {
	private int ID;
	private String creator;
	private String owner;
	private int priority;
	
	/*
	 * Constructor, not assigning ID until ticket is added to the queue.
	 * This way I can ensure a unique ID is assigned.
	 */
	public Ticket(String j, String k, int u){
		if(4 >= u && u >= 1) {
			creator = j;
			owner = k;
			priority = u;
		}
		else {
			System.out.println("Invalid priority. Please assign valid priority");
			System.out.println("*****Priorites*****");
			System.out.println("1.Security Issue");
			System.out.println("2.Network Issue");
			System.out.println("3.Software Installation");
			System.out.println("4.New Computer Configuration");
		}
	}
	public void setID() {
		long unixTime = System.currentTimeMillis() / 1000;	
		ID = priority * Math.toIntExact(unixTime);
	}
	
	public int getID() {
		return ID;
	}
	
	public String getCreator() {
		return creator;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int priority() {
		return priority;
	}
}
