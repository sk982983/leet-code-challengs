package arrays;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6 };
		int[] result = twoSum(nums, 4);

		for (int i : result) {

			System.out.println(i);

		}

	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };

				}
			}

		}

		throw new IllegalArgumentException("No two sum solution");

	}

}
