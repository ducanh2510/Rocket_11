import java.util.Random;

public class Random_Number {
	
	public void main(String arg[]) {
		Random random = new Random();
		int a = random.nextInt();
		System.out.println(a);
		
		String names[] = {"a", "b", "c", "d"};
		int length = names.length;
		int i = random.nextInt(length);
		System.out.println(names[i]);
	}
}
