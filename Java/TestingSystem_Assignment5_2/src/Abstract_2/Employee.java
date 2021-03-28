package Abstract_2;

public abstract class Employee extends User{
	public double caculatePay() {
		setSalary_ratio(getSalary_ratio() * 420);
		return getSalary_ratio();
	}
}
