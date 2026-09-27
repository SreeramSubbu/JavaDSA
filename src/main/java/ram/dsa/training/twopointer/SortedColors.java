package ram.dsa.training.twopointer;

/**
 * function to sort a given integer array nums in-place (and without the built-in sort function),
 * where the array contains n integers that are either 0, 1, and 2 and represent the colors red, white, and blue.
 * Arrange the objects so that same-colored ones are adjacent, in the order of red, white, and blue (0, 1, 2).
 */
public class SortedColors {

    /**
     *
     * All elements to the left of the left are 0s.
     * All elements between left and i - 1 are 1s.
     * All elements between `i` and right are unsorted.
     * All elements to the right of right are 2s.
     */

    public static int[] sort(int[] colors) {
        int left = 0, i = 0;
        int right = colors.length - 1;
        while (i <= right) {
            if (colors[i] == 0) {
                int temp = colors[left];
                colors[left] = colors[i];
                colors[i] = temp;
                left++;
                i++;
            } else if (colors[i] == 2) {
                int temp = colors[right];
                colors[right] = colors[i];
                colors[i] = temp;
                right--;
            } else {
                i++;
            }
        }
        return colors;
    }
}
