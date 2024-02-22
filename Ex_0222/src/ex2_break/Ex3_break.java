package ex2_break;

public class Ex3_break {
	public static void main(String[] args) {

		// 1부터 10까지 반복되는 for문 안에서
		// 5를 초과하는 숫자 중 , 첫번째로 만나는 2의배수를 찾아 출력
		// -----------------
		// 결과 : 6

		for (int i = 1; i <= 10; i++) {

			if (i > 5 && i % 2 == 0) {
				System.out.println("결과 : " + i);
				break;
			}

		} // for

		System.out.println("-----------------------------------------------------------------");

		// n1과 n2의 최소공배수를 찾으시오
		// 최소공배수 : 12
		int n1 = 4;
		int n2 = 6;

		for (int i = 1; i <= n1 * n2; i++) {

			if (i % n1 == 0 && i % n2 == 0) {
				System.out.println("최소공배수 : " + i);
				break;
			}
		} // for
	}// main
}
