package ex1_multi_for;

public class Ex1_multiFor {
	public static void main(String[] args) {
		//다중for문 : for문 안에 for문이 포함되어 있는 경우
		
		//1 2 3
		//1 2 3
		
		//i = 3
		//j = 1
		
		for( int i = 1; i <= 2; i++ ) { //y축(행)	
			
			for( int j = 1; j <= 3; j++) { //x축(열) 
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("------------------------------");
		
		for(int i = 0; i <= 2; i++) {
			
			System.out.print("i:" + i + " = ");
			
			for(int j = 3; j > 0; j--) {
				System.out.print(j + " ");
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
