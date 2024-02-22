package ex2_value_type;

public class Ex1_valueType {
	public static void main(String[] args) {
		//다중주석 : /* 주석코드 */
		/* 
		 기본자료형
		 1) 논리형 : boolean
		 2) 문자형 : char
		 3) 정수형 : byte .............. 1byte(-128 ~ 127)
		 			short ............ 2byte(-32,768 ~ 32,767)
		 			int .............. 4byte(-21억 ~ 21억 )
		 			long ............. 8byte(-900경 ~ 900경)
		 4) 실수형 : float ............. 4.x byte 
		 			double ............ 8.x byte
		 */
		
		//변수 : 특정값을 기억하여 저장할 때 사용
		//변수 생성 규칙
		//1) 자료형 변수명; (선언)
		//2) 변수명 = 값; (대입)
		//3) 자료형 변수명 = 값;(초기화)
		
		//----------------------------
		//1) 논리형: true, false(참, 거짓)의 두 가지 값만을 저장할 수 있는 타입
		//boolean b = 10; 자료형 타입과 맞지 않은 데이터를 추가할 수 없다
		boolean b = true;
		b = false;
		System.out.println("b : " + b);
		
		System.out.println("-----------------------");

		//문자형
		//문자형은 홑따옴표 안에 딱 한글자만 저장 가능한 자료형
		char ch = 'A';
		System.out.println("ch : " + ch);
		
		char ch2 = 65 + 1; //아스키코드의 66번에 해당하는 문자 B가 저장
		System.out.println("ch2 : " + ch2);
		
		System.out.println("-------------------------");
		
		//정수형
		//byte bNum = 128;
		int num1 = 2100000000;
		
		//정수를 저장하는 자료형은 default값이 int로 지정되어 있기 때문에
		//21억을 넘는 데이터를 저장하고자 한다면 L을 붙여서 long에 담는다는 것을 인지
		long num2 = 2200000000L;

		System.out.println("-----------------------");
		
		//실수형 : 소수점을 가지고 있는 값들을 저장하기 위한 자료형
		float f1 = 3.14F;
		double f2 = 3.14;
		System.out.println("f1 : " + f1);
		
		f1 = 100;
		f2 = 200;
		System.out.println("f1 : " + f1);
	}//main
}
