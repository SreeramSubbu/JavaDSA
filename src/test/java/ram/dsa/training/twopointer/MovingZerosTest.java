package ram.dsa.training.twopointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovingZerosTest {

    @Test
    public void testSample1() {
        int[] sample = {2, 0, 4, 0, 9};
        var output = MovingZeros.execute(sample);
        assertArrayEquals(new int[]{2, 4, 9,0,0}, output);
    }

    @Test
    public void testSample2() {
        int[] sample = {0,0,0};
        var output = MovingZeros.execute(sample);
        assertArrayEquals(new int[]{0,0,0}, output);
    }

    @Test
    public void testSample3() {
        int[] sample = {0,1,0,3,12};
        var output = MovingZeros.execute(sample);
        assertArrayEquals(new int[]{1,3,12,0,0}, output);
    }

    @Test
    public void testSample4() {
        int[] sample = {1,2,0,3,12};
        var output = MovingZeros.execute(sample);
        assertArrayEquals(new int[]{1,2,3,12,0}, output);
    }

}