package ram.dsa.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    RotateArray target = new RotateArray();

    @Test
    public void test1() {
        int[] input = {3, 8, 9, 7, 6};
        int[] expected = {9, 7, 6, 3, 8};
        int[] result = target.rotate(input, 3);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        int[] result = target.rotate(input, 4);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        int[] input = {0, 0, 0};
        int[] expected = {0, 0, 0};
        int[] result = target.rotate(input, 1);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test4() {
        int[] input = new int[0];
        int[] result = target.rotate(input, 1);
        assertArrayEquals(input, result);
    }

    @Test
    public void test5() {
        int[] input = {3, 8, 9, 7, 6};
        int[] expected = {9, 7, 6, 3, 8};
        int[] result = target.rotate(input, 53);
        assertArrayEquals(expected, result);
    }
}