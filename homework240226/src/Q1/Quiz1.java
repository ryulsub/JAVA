package Q1;

public class Quiz1 {
	public static void main(String[] args) {
		
	
	/* 정수로 이루어진 1차원 배열이 주어졌을 때, 배열에 있는 모든 요소의 합을 구하는 프로그램을 작성하세요.
	 * {1,2, 3, 4, 5};
	 * 
	 * 출력 결과:
	 * 배열 요소의 합: 15
	 * 
	 */
	
	int[] array = {1, 2, 3, 4, 5};
		int sum = 0;
		for ( int num : array) {
			sum += num;
		}
		System.out.println("배열 요소의 합 : " + sum);
	}
	
}
