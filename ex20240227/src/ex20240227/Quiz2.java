package ex20240227;

import java.util.ArrayList;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 다음은 ArrayList를사용하여 정수를 저장하는 프로그램입니다.
		 * ArrayList에 1부터 10까지의 정수를 for 문을 사용하여 추가하고
		 * 모든 정수를 더한 결과를 for문을 사용하여 출력하는 코드를 작성하세요.
		 * 
		 */
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		// 동적 배열에 숫자 넣기
		for ( int i = 1; i <= 10; i++) {
			nums.add(i);
		}
		
		int sum = 0;
		// 동적 배열에서 하나씩 꺼내서 더한다.
		for (int num : nums) { //for each
			// sum = sum + num;
			sum += num;
		}
		
		System.out.println("sum of integers: " + sum );
		
		
	}
}
