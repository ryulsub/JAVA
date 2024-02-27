package ex20240227;

public class dayquiz2 {
	public static void main(String[] args) {
		int[] nums = {10, 25, 8, 30, 15};
		int min = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if( nums[i] < min) {
				min = nums[i];

			}
		}
		System.out.println("배열에서 최소값: " + min);
	}
}
