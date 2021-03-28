package Abstract_2;

public abstract class Manager extends User{
	public double caculatePay() {
		setSalary_ratio(getSalary_ratio() * 520);
		return getSalary_ratio();
	}
}
