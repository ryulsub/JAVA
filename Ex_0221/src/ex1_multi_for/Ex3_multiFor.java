package ex1_multi_for;

public class Ex3_multiFor {
	public static void main(String[] args) {

		// A B C D
		// E F G H
		// I J K L
		// int cnt = 65;
		char c = 'A';

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 4; j++) {
				// System.out.print((char)cnt++ + " " );
				System.out.print(c++ + " ");
			} // inner

			System.out.println();
		} // outer

		System.out.println("---------------------------------------------------------------------------");
		
		
				
		for (int i = 2; i <= 9; i++) {
				
			for (int j = 1; j <= 9; j++) {
				
				System.out.printf(" %d * %d  =  %d\n ", i , j, i*j);  
						
			} // inners
																		
			System.out.println();
		} // outer

	}// main
}
