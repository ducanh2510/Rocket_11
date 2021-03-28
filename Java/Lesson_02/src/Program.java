import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("x = ");
//		int x = scanner.nextInt();
//		System.out.println("So x = " + x);
		
		// 1
		int[] numbers;
		for(int i = 0; i < 3; i++) {
			System.out.println("Moi nhap so thu %d" + (i + 1));
			
		}
		
		System.out.println("Moi nhap ho va ten: ");
		String fullname = scanner.nextLine();
		System.out.println("Ten ban la: " + fullname);
	}

}
