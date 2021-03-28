
public class Student {

	private int id;
	private String name;
	private String homeTown;
	private float academic_Score;
	
	public Student(String name, String homeTown) {
		this.name = name;
		this.homeTown = homeTown;
		this.academic_Score = 0;
	}
	
	public void setAcademic_Score(float value) {
		this.academic_Score = value;
	}
	
	public void addAcademic_Score(float value) { 
		this.academic_Score += value;
	}
	
	public void showInforStudent() {
		System.out.println("**********Student**********");
		System.out.printf("%s\t", this.academic_Score);
		if(this.academic_Score < 4.0) {
			System.out.println("Yeu");
		}else if(this.academic_Score > 4.0 && this.academic_Score < 6.0) {
			System.out.println("Trung binh");
		}else if(this.academic_Score > 6.0 && this.academic_Score < 8.0) {
			System.out.println("Kha");
		}else {
			System.out.println("Gioi");
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}
