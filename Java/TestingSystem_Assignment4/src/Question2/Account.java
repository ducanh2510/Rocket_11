package Question2;

public class Account {

	private String id;
	private String name;
	private int balance;
	
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	
	public void credit(int amount) {
		
	}
	
	public void debit(int amount) { 
		
	}
	
	public void transferTo(Account account, int amount) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
