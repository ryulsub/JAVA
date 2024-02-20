package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		
		//switch문의 비교값으로 사용가능한 자료형 타입
		//정수(byte, short, int), 문자(char), 문자열(String)
		
		String lastName = "정";
		switch( lastName ) {
		case "김":
			System.out.println("21%");
			break;
			
		case "이":
			System.out.println("14%");
			break;
		
		case "박":
			System.out.println("8%");
			break;
			
		default:
			System.out.println("죄송합니다. 준비중입니다");
			break;
			
		}//main
		
	}
	
}
