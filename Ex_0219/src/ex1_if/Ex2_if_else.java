package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
		
		//if-else : 하나의 if문으로 조건에 대한 참과 거짓을 모두 커버할 수 있는 제어문
		//if(조건식){
		//	조건식이 참일때 실행되는 영역
		//}else{
		//	조건식이 거짓일 때 실행되는 영역
		//}
		
		char n = '남';
		String str = "";
		
		if( n++ == '남' ) {
			str = "남자 화장실로";
		}else {
			//if문의 조건이 거짓일 때 반드시 호출되는 영역
			str = "여자 화장실로";
		}
		
		System.out.println(str);
		
		System.out.println("----------------------------------");
		
		//변수 age에 나이를 대입하고, 21세 이상이면서
		//height에 저장된 키가 170이상이라면
		//'롤러코스터 탑승가능'을 출력
		//'롤러코스터 탑승불가'를 출력
		
		int age = 21;
		int height = 170;
		if( age >= 21 && height >=170 ) {
			System.out.println("탑승가능");
		
		}else {
			System.out.println("탑승불가");
		
		}
		
		System.out.println("-----------------------------------");
		
		//위의 남녀 화장실 코드를 삼항연산자로 바꿔보시오
		
		/*char n = '남';
		String str = "";
		
		if( n++ == '남' ) {
			str = "남자 화장실로";
		}else {
			//if문의 조건이 거짓일 때 반드시 호출되는 영역
			str = "여자 화장실로";
		}
		*/
		
		char gender = '여';
		String s = gender == '남' ? "남자화장실로" : "여자화장실로";
		System.out.println(s);
		
	}//main
}
