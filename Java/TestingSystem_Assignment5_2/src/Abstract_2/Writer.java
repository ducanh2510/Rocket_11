package Abstract_2;

public abstract class Writer extends User{
	public double caculatePay() {
		setSalary_ratio(getSalary_ratio() * 220);
		return getSalary_ratio();
	}
}
