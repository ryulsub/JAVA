package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		
		//switch-case문 :
		//조건식이 아닌 비교값을 주고, 그와 일치하는 조건값을 찾아 실행하는 제어문
		
		//switch(비교값 ){
		//	case 조건값: 
		// 		비교값과 조건값이 일치하면 실행되는 영역
		//		break;
		//}
		
		int n = 3;
		
		//switch비교값과 조건값의 타입은 반드시 일치해야 한다.
		switch( n ) {//비교값
		
		case 1://조건값
			System.out.println("1.게임시작");
			break;//break를 통해 switch를 빠져나간다
			
		case 2:
			System.out.println("2.게임소개");
			break;
		
		case 3:
			System.out.println("3.게임종료");
			break;
		
		default:
			//비교값과 조건값이 하나도 일치하지 않는다면 실행되는 영역
			System.out.println("1 ~ 3까지만 유효합니다");
			break;
			
		}//switch
		
		
	}///main
}
