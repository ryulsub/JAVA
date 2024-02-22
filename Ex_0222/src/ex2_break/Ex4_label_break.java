package ex2_break;

public class Ex4_label_break {
	public static void main(String[] args) {
		
		//label : 가장 가까운 반복문을 제어하는 것이 아니라,
		//한 번에 두개 이상의 반복문을 제어 할 수 있도록 label을 지정하는 구조	
	
	aa : for( int i = 1; i <= 2; i++) {
			
		for( int j = 1; j <= 10; j++) {
				
				if( j % 2 == 0 ) {
					break aa;
				}
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		
	}//main
}
