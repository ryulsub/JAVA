package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		
		//캐스팅(형변환)
		//1.프로모션 캐스팅
		// - 큰 자료형에 작은 자료형을 대입하는 것
		// - 자동으로 JVM에서 해결
		double d1 = 100.5; //8byte
		int n = 200; //4byte
		
		d1 = n;
		System.out.println("d1 : " + d1);
		
		System.out.println("--------------------");
		
		char c = 'A'; //2byte
		int n2 = 100; //4byte
		n2 = c;
		System.out.println("n2 : " + n2);
		
	}//main
}
