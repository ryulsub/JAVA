package ex1_multi_for;

public class Ex4_multiFor {
	public static void main(String[] args) {

		// *
		// * *
		// * * *
		// * * * *
		// * * * * *

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			} // inner

			System.out.println();
		} // outer

		System.out.println("------------------------------------------------");
		System.out.println("------------------------------------------------");
		System.out.println("------------------------------------------------");

		//       *
		//     * * *
		//   * * * * *
		//  * * * * * * *
		// * * * * * * * * *

		for (int i = 0; i < 5; i++) {

			for ( int j = 0; j < i + 5; j++) {

				if ( i + j >= 4 ) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				
			} // inner
			
			System.out.println();
		} // outer
		
		
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		
		//01
		//02 03
		//04 05 06
		//07 08 09 10
		//11 12 13 14 15
		
		int cnt = 1;
		
		for ( int i = 1; i <= 5; i++) {
			
			for ( int j = 1; j <= i; j++) {
				System.out.printf("%02d ", cnt++);
			}//inner
			
			System.out.println();
		}//outer
		
		
		
	}// main
}
