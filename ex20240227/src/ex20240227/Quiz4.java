package ex20240227;

import java.util.ArrayList;

public class Quiz4 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for ( int i = 1; i <= 10; i++) {
			nums.add(i);
		
		}
		
		for ( int num : nums) {
			if( num % 2 == 0) {
				System.out.println(num);
			}
		}
		
		
		}
		
}
