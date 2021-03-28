import java.util.Date;

public class Account {
	String Email;
	String Username;
	String Fullname;
	Date CreateDate;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "Email: " + Email + "\n";
		result += "Username: " + Username + "\n" + "Fullname: " + Fullname + "\n";
		return result;
	}
}
