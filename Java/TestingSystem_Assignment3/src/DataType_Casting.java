import java.util.Random;
import java.util.Scanner;

public class DataType_Casting {
	
	// Question 1
	public static void question1() {
		float account1_salary = 5240.5f;
		float account2_salary = 10970.055f;
		int salary_acc1 = (int) account1_salary;
		int salary_acc2 = (int) account2_salary;
//		System.out.println(salary_acc1);
//		System.out.println(salary_acc2);
	}
	
	// Question 2
	public static void question2() {
		Random random = new Random();
		int number_random = random.nextInt(100000);
		String format = String.format("%05d", number_random);
		System.out.println(format);
	}
	
	// Question 3
	public static void question3() {
		Random random = new Random();
		Integer number_random = random.nextInt(100000);
		int socuoi = number_random % 100;
		System.out.println(socuoi);
	}
	
	// Question 4
	public static void divisionNumber() {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		System.out.println("Moi nhap so a: ");
		a = scanner.nextInt();
		System.out.println("Moi nhap so b: ");
		b = scanner.nextInt();
		float c = (float) a/b;
		System.out.printf("Thuong cua 2 so a va b la: %f\n", c);
	}

	public static void main(String[] args) {
		
		
	}

}










