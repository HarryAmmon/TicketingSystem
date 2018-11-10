
public class Ticket {
	private int ID;
	private String creator;
	private String owner;
	private int priority;
	private static final int AUTO_ID = -1;
	
	/**
	 * Constructors, one that will auto generate an ID and another that will use the one assigned
	 * @param Creator
	 * @param Owner
	 * @param Priority
	 */
	public Ticket(String j, String k, int u){
		if(4 >= u && u >= 1) {
			ID = AUTO_ID;
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
	public Ticket(int i, String j, String k, int u){
		if(4 >= u && u >= 1) {
			ID = i;
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
	
	public void setID(int i) {
		ID = i;
		
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
	
	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int i) {
		priority = i;
		
	}
}
