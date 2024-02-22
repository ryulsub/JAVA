package ex2_break;

public class Ex5_label_break {
	public static void main(String[] args) {
		
		//1에서 5까지 존재하는 두 개의 주사위를 던졌다.
		//이때 합이 7이 되는 첫번째 경우를 찾아 출력
		//(1, 6) / (2, 5) / (3, 4) / (4, 3), (5, 2)
		//--------------------------------------------
		//결과 : 1, 6
		outer : for( int i = 1; i <= 5; i++) {
			
			for( int j = 1; j <= 5; j++) {
				
				if(i + j == 7) {
					System.out.printf("결과 : %d, %d\n", i, j);
					break outer;
				}
			
			}//inner
			
		}//outer
		
		
	}// main
}
