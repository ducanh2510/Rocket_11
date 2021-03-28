
public class Loop {

	// Question 1
	public static void question3() {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("%d\t", numbers[4*i+j]);
			}
			System.out.printf("\n");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question3();
	}

}
