package ex2_work;

public class Ex1_work {
	public static void main(String[] args) {

		/*
		  2 * 1 = 2  3 * 1 = 3 ... 9 * 1 = 9 
		  2 * 2 = 4  3 * 2 = 6 ...
		    ...  
		  2 * 9 = 18 ........................ 9 * 9 = 81
		 */
		
		for (int i = 2; i <= 9; i++) {
			
			for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				
			} // inner
			
				System.out.println();
				
			} // outer

		} // main
	}
