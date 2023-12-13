package br.com.kualit.algorithms;

public class WindowSliding {
    public int[] maxSum(int[] nums) {
        int maxSum = 0;
        int maxSumIndex = -1;
        int count = nums.length - 3;

        for (int i = 0; i <= count; i++) {
            int actualMaxSum = nums[i] + nums[i + 1] + nums[i + 2];

            if (actualMaxSum > maxSum) {
                maxSum = actualMaxSum;
                maxSumIndex = i;
            }
        }
        return new int[]{maxSumIndex, maxSum};
    }
}
