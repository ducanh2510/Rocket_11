
public class Department {
	
	private int id;
	private String departmentName;
	
	public Department() {
		
	}
	
	public Department(String name) {
		id = 0;
		departmentName = name;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public static void main(String[] args) {
		
	}
}
