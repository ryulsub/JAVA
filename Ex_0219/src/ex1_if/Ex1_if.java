package ex1_if;

public class Ex1_if {
	public static void main(String[] args) {
		//제어문(control statement) : 프로그램의 흐름을 제어하는 문장
		//1) 분기문 : if, switch
		//2) 반복문 : for, while
		
		//if문 : 
		//if( 조건식 ){
		// 조건식이 참일 때 실행되는 영역
		//
		//}
		
		int n = 52;
		
		//String은 쌍따옴표 안에 여러글자를 저장할 수 있는 자료형
		String str = "";
		//String str = null; 
		
		if( n == 50 ) {
			str = "50이군";
		}
		
		if( n != 50 ) {
			str = "50이 아닙니다";
		}
		
		System.out.println(str);
		
	}//main
}
