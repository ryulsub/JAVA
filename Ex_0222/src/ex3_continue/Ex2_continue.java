package ex3_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		
		int n = 0;
		while( n < 5 ) {
			n++;
			
			if(n % 2 == 0) {
				//while문 내부의 continue는
				//while문의 조건식으로 건너뛴다
				continue;
			}
			
			System.out.println(n);
		
		}//while
		
		System.out.println("--------------------------------------------------------------");
		
		int i = 1;
		while( i < 5) {
			i++;
			
			switch( i ) {
			case 2:
				System.out.println("2출력");
				//반복문 내부의 switch에서는 예외적으로
				//break대신 continue문을 사용할 수 있다.
				continue;
				
			case 3:
				System.out.println("3출력");
				break;
				
			case 4:
				System.out.println("4출력");
				break;
			}//switch
			
		}//while
		
	}//main
}
