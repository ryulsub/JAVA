package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		//2) 디모션 캐스팅
		// - 작은 자료형에 큰 자료형이 대입되는 것
		// - 자동으로 처리되지 않음
		char c1 = 'A';
		int n1 = c1 + 1;
		c1 = (char)n1;
		System.out.println("c1 : " + c1);
		
		float f1 = 5.5f;
		int n2 = 0;
		n2 = (int)f1;
		System.out.println("n2 : " + n2);
	}//main
}
