package Abstract_2;

public abstract class User {
	private String  name;
	private double salary_ratio;
	
	public abstract double caculatePay();
	
	public void displayInfor() {
		String result = "Name: " + getName() + "\t"
						+ "Salary ratio: " + getSalary_ratio();
		System.out.println(result);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary_ratio() {
		return salary_ratio;
	}
	public void setSalary_ratio(double salary_ratio) {
		this.salary_ratio = salary_ratio;
	}
	
}
