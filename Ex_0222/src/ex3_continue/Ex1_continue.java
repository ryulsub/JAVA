package ex3_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue문 : 반복문 내에서 특정문장을 무시하고 건너뛰고자 할 때
		for ( int i = 1; i <= 2; i++) {
			
			for( int j = 1; j <= 5; j++) {
				
				if( j % 2 == 0) {
					//continue를 포장하고 있는 반복문이 for문 이라면
					//해당 for문의 증감식으로 강제로 이동한다
					continue;
					//System.out.println();
				}
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("-------------------------------------------------------------------------------------------------");
	
		for( int i = 1; i <= 2; i++ ) {
			
			for(int j = 1; j <= 5;) {
				j++;
				
				if( j % 2 == 0) {
					//for문에서 의도적으로 증감식이 제외된 경우라면
					//continue를 만났을때, 가까운 for문에 조건식으로 건너뛴다
					continue;
				}
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
		}//outer
		
	}//main
}
