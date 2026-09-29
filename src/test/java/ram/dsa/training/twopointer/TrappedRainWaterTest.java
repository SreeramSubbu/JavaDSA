package ram.dsa.training.twopointer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TrappedRainWaterTest {

    @ParameterizedTest
    @MethodSource("heightsSource")
    public void test1(int[] sampleHeights, int expected) {
        int result = TrappedRainWater.calculate(sampleHeights);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> heightsSource() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 1, 2, 2, 5, 1, 0, 2}, 10),
                Arguments.of(new int[]{5, 0, 5}, 5),
                Arguments.of(new int[]{0, 1, 2, 1, 0, 1, 3, 2}, 4)
        );
    }

}