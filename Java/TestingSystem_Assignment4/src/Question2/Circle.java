package Question2;

public class Circle {

	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		double area;
		area = Math.PI * radius * radius;
		return area;
	}

	@Override
	public String toString() {
		String result = "";
		result += "Radius: " + this.getRadius()
				+ "Color: " + this.getColor()
				+ "Area: " + this.getArea();
		return result;
	}
	
	public static void main(String[] args) {
		
	}

}
