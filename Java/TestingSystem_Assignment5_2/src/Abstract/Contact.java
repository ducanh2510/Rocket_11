package Abstract;

public class Contact{
	private String name;
	private String number;
	
	public Contact(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "Name: " + getName() + "\t"
				+ "Number: " + getNumber();
		return result;
	}
	
}
