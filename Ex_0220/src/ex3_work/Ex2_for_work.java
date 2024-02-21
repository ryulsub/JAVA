package ex3_work;

public class Ex2_for_work {
	public static void main(String[] args) {
		// n1 ~ n2까지의 합을 계산하여 출력
		// 예를들어 2와 5를 입력받았다면 2 + 3 + 4 + 5의 연산결과인 14가 출력
		// 단, 2와 5를 입력받은 결과와 5와 2를 입력받은 결과가 같아야 한다
		// -----------------------
		// 결과 : 14
		int n1 = 2;
		int n2 = 5;
		
		int result = 0;
		
		//n1이 n2보다 크다면 두 변수의 값을 교환하여
		//반드시 n1이 n2보다 작은수가 되도록 처리
		if( n1 > n2 ) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		
		for(int i = n1; i <= n2; i++) {
			
			result += i;
			
		}//for
		
		System.out.println("결과 : " + result);
			
	}// main
}
