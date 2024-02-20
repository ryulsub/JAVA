package ex2_single_for;

public class Ex2_for {
	public static void main(String[] args) {
		//8 * 1 = 8
		//8 * 2 = 16
		// ...
		//8 * 9 = 72
		int dan = 10;
		
		if( dan <=1 || dan >= 10 ) {
			System.out.println("2~9사이의 구구단만 출력합니다");
		}else {
			
			for( int i = 1; i <=9; i++ ) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
				
			}//for
			
		}
		
	}//main
}
