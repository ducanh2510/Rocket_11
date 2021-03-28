import java.time.LocalDate;
import java.util.Random;

public class Random_Number {

	// Question 1
	public static void question1() {
		Random random = new Random();
		int number = random.nextInt();
		System.out.println("" + number);
	}
	
	// Question 2
	public static void question2() {
		Random random = new Random();
		float number = random.nextFloat();
		System.out.println("" + number);
	}
		
	// Question 3
	public static void question3() {
		String names[] = {"a", "b", "c", "d"};
		Random random = new Random();
		int length = names.length;
		int i = random.nextInt(length);
		System.out.println(names[i]);
	}
	
	//  Question 4
	public static void question4() {
		Random random = new Random();
		int minDay = (int) LocalDate.of(1995,07,24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995,12,20).toEpochDay();
		
		long randomInt = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		
		System.out.println("Random date: " + randomDay);
	}
	
	//  Question 5
	public static void question5() {
		Random random = new Random();
		int minDay = (int) LocalDate.of(2020,01,01).toEpochDay();
		int maxDay = (int) LocalDate.of(2021,03,23).toEpochDay();
		
		long randomInt = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		
		System.out.println("Random date: " + randomDay);
	}
	
	//  Question 6
	public static void question6() {
		Random random = new Random();
		int minDay = (int) LocalDate.of(1970,01,01).toEpochDay();
		int maxDay = (int) LocalDate.of(2021,03,23).toEpochDay();
		
		long randomInt = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		
		System.out.println("Random date: " + randomDay);
	}
	
	// Question 7
	public static void question7() {
		Random random = new Random();
		int number = 100 + random.nextInt(899);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// question1();
		//question2();
		// question3();
		// question4();
		// question5();
		question6();
	}

}
