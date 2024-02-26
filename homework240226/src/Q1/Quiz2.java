package Q1;

public class Quiz2 {
	public static void main(String[] args) {

		/*
		 * - 문제:
		 * 
		 * 정수로 이루어진 1차원 배열이 주어졌을 때, 배열의 모든 요소의 평균을 계산하는 프로그램을 작성하세요.
		 * 
		 * {5, 10, 15, 20, 25};
		 * 
		 * 출력 결과n
		 * 
		 * 배열 요소의 평균: 15.0
		 */

		int[] array = { 5, 10, 15, 20, 25 };
		int avr = 0;
		for (int num : array) {
			avr += num;
		}
		System.out.println("배열 요소의 평균 :" + avr);
	}

}
