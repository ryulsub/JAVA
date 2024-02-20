package ex1_formatter;

public class Ex1_printf {
	public static void main(String[] args) {

		int age = 20;
		// 제 나이는 20살 입니다
		// System.out.println("제 나이는 " + age + "살 입니다");
		System.out.printf("제 나이는 %d살 입니다\n" , age);
		
		age = 30;
		float height = 170.5f;
		//제 나이는 30이고, 키는 170.5cm입니다
		System.out.printf("제 나이는 %d살이고, 키는 %fcm입니다\n", age, height);
		
		//저는 김씨입니다
		System.out.printf("저는 %c씨 입니다\n", '김');
		
		//참은 true이고, 거짓은 false입니다
		System.out.printf("참은 %b이고, 거짓은 %b입니다\n", true, false);
		
		//홍길동은 빵을 좋아해
		System.out.printf("%s(은)는 %s(을)를 좋아해\n", "홍길동", "빵");
		
		//오늘의 기온은 3.1도입니다
		System.out.printf("오늘의 기온은 %.1f도 입니다\n", 3.1);
		
		//03월은 31일까지 있어요
		System.out.printf("%02d월은 %02d일까지 있어요\n", 3, 31 );
		
		//김씨는 24%입니다
		System.out.printf("김씨는 %d%%입니다\n", 24);
		
		//formatter의 종류
		//1) %d : 정수 
		//2) %f : 실수
		//3) %c : 문자
		//4) %b : boolean타입
		//5) %s : 문자열(String)
		//6) %% : %
		
		System.out.println("안녕\n하세요");
		System.out.println("1\t홍길동\t20\t서울특별시\n");
		//escape코드
		//1) \n : 강제개행
		//2) \t : tab만큼의 간격을 확보
		
		
		
	}// main
}
