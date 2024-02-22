package ex3_continue;

public class Ex3_label_continue {
	public static void main(String[] args) {
	
		out : for (int i = 1; i <= 2; i++) {
			
			for( int j = 1; j <= 3; j++) {
				
				if( j % 2 == 0) {
					continue out;
				}
				System.out.print(j + " ");
					
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
