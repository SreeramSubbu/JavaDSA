package ram.dsa.training.twopointer;

/**
 * calculate the total amount of water trapped between bars on an elevation map, where each bar's width is 1.
 * The input is given as an array of n non-negative integers height representing the height of each bar.
 */
public class TrappedRainWater {

    /**
     *This is the insight behind how the two-pointer technique can be used to solve this problem.
     * We initialize two pointers left and right at opposite ends of the array.
     * We also keep two variables leftMax and rightMax to keep track of the highest bars each pointer has seen.
     */
    public static int calculate(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int leftMax = heights[left];
        int rightMax = heights[right];
        int count = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                if (heights[left] >= leftMax) {
                    leftMax = heights[left];
                } else {
                    count += leftMax - heights[left];
                }
            } else {
                right--;
                if (heights[right] >= rightMax) {
                    rightMax = heights[right];
                } else {
                    count += rightMax - heights[right];

                }
            }
        }
        return count;
    }
}
