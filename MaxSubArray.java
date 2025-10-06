class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public int[] subarraySums(int[] arr, int k) {
        if (arr == null || arr.length < k || k <= 0) {
            return new int[0];
        }

        int[] result = new int[arr.length - k + 1];
        int current = 0;

        for (int i = 0; i < k; i++) {
            current += arr[i];
        }

        result[0] = current;

        for (int j = 1; j < arr.length - k + 1; j++) {
            current += arr[j + k - 1] - arr[j - 1];
            result[j] = current;
        }

        return result;
    }
}
