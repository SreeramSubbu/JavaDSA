package ram.dsa.training.slidingwindow;

/**
 * Given an array of integers nums and an integer k,
 * find the maximum sum of any contiguous subarray of size k.
 */
public class MaxSumSubArray {

    /**
     * We start by extending the window to size.
     * Whenever our window is of size, we first compute the sum of the window and update max_sum if it is larger than max_sum.
     * Then, we contract the window by removing the leftmost element to prepare for the next iteration.
     */
    public static int calculate(int[] nums, int size) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;
        int startOfWindow = 0;
        for (int endOfWindow = 0; endOfWindow < nums.length; endOfWindow++) {
            windowSum += nums[endOfWindow];
            if (endOfWindow - startOfWindow + 1 == size) {
                if (windowSum > maxSum) {
                    maxSum = windowSum;
                }
                windowSum -= nums[startOfWindow];
                startOfWindow++;
            }
        }
        return maxSum;
    }
}
