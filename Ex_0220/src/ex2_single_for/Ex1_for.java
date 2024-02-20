package ex2_single_for;

public class Ex1_for {
	public static void main(String[] args) {
		//for문 : 특정 명령문을 원한느 만큼 반복하고자 할 때
		
		//for( 초기식; 조건식; 증감식 ){
		//	조건식이 참일때 실행되는 영역
		//}
		
		int a = 0;
		
		for( int i = 0; i <= 2; i++ ) {
			
			//'전역변수'a는 main 영역뿐만 아니라,
			//for문, if문 등 나보다 작은 범위의 영역까지 침범이 가능
 			a= 11;
			int j = 10;
			System.out.println(i);
			
		}//for1
		
		//i, j등 for문 안에서 만들어진 '지역변수'들은
		//for문 밖에서는 사용할 수 없다
		//i = 3;
		//j = 0;
		System.out.println("-----------------------------");
		
		int i = 0;
		for( ; i < 3; i++ ) {
			System.out.println(i);
		}//for2
	System.out.println("i : " + i);
		
		
		System.out.println("-----------------------------");
		
		
		//10 9 8 7 6 5 4 3 2 1
		for(int j = 10; j > 0; j--) {
			
			System.out.print(j + " ");
			
		}//for3
		
		System.out.println();//줄바꿈
		System.out.println("-------------------------------");
	
		
		//1부터 100까지 반복하는 for문을 만들되
		//화면에는 3의 배수만 출력
		for( int f = 1; f <= 100; f++  ) {
			
			if( f % 3 == 0) {
				System.out.println(f);
	
		}
		
	}//main
}
	}
