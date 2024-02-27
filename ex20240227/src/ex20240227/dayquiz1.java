package ex20240227;

public class dayquiz1 {
	public static void main(String[] args) {
		int[] nums = {10, 25, 8, 30, 15};
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			if( nums[i] > max) {
				max = nums[i];
				
			}
		}
			System.out.println(" 배열에서 최대값: " + max);
		}
	
	}
