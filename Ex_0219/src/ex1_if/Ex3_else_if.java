package ex1_if;

public class Ex3_else_if {
	public static void main(String[] args) {
		
		//else-if문 : 여러개의 조건비교가 필요한 경우
		
		int num = 75;
		String str = "";
		
		if( num >= 90 ) {
			str = "A";
		}else if( num >= 80 ){
			str = "B";
		}else if( num >= 70) {
			str = "C";
		}else if( num >= 60) {
			str = "D";
		}else {
			//위의 모든 조건이 거짓일 때 반드시 거치는 영역
			str = "F";
		}
		
		System.out.println(str);
	}//main
}
