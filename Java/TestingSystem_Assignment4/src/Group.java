import java.util.Date;

public class Group {
	private int id;
	private String name;
	private int creator;
	private Account[] account;
	private Date createDate;
	
	public Group() {
		this.id = 0;
		this.name = "";
		this.createDate = new Date();
	}
	
	public Group(String groupName, int creator, Account[] accounts, Date createDate) {
		this.name = groupName;
		this.creator = creator;
		this.account = accounts;
		this.createDate = createDate;
	}
	
	public Group(String groupName, int creator, String[] usernames, Date createDate) {
		this.name = groupName;
		this.creator = creator;
		int i = 0;
		Account accounts[] = new Account[usernames.length];
		for(String username: usernames) {
			accounts[i] = new Account(username);
			i++;
		}
		this.account = accounts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account[] getAccountID() {
		return account;
	}

	public void setAccountID(Account[] accountID) {
		this.account = accountID;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public static void main(String[] args) {
		
	}
}
