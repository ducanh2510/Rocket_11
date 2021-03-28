import java.util.Date;

public class Account {
	int id;
	String email, username, fullname;
	Department departmentID;
	Position positionID;
	Date createDate;
	
	@Override
	public String toString() {
		String result;
		result = "ID: " + id + "\n"
				+ "Email: " + email + "\n"
				+ "Username" + username + "\n"
				+ "Fullname" + fullname + "\n"
				+ departmentID.toString()
				+positionID.toString();
		return super.toString();
	}
}
