import java.util.Date;

public class Account {
	
	private int id;
	private String email, username, firstname, lastname, fullname;
	private Department departmentID;
	private Position positionID;
	private Date createDate;
	private Group[] group;
	
	public Account(String username) {
		this.username = username;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {  
		this.email = email;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Department getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Department departmentID) {
		this.departmentID = departmentID;
	}

	public Position getPositionID() {
		return positionID;
	}

	public void setPositionID(Position positionID) {
		this.positionID = positionID;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Group[] getGroup() {
		return group;
	}

	public void setGroup(Group[] group) {
		this.group = group;
	}

	public Account(int Id, String Email, String Username, String Firstname, String Lastname) {
		id = Id;
		email = Email;
		username = Username;
		firstname = Firstname;
		lastname = Lastname;
		fullname = firstname + lastname;
	}
	
	public Account(int Id, String Email, String Username, String Firstname, String Lastname, Position position) {
		id = Id;
		email = Email;
		username = Username;
		firstname = Firstname;
		lastname = Lastname;
		positionID = position;
		createDate = new Date();
	}
}






