package ram.dsa.training.slidingwindow;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MaxSumSubArrayTest {

    @ParameterizedTest
    @MethodSource("samples")
    public void testSample1(int[] sample, int size, int expected) {
        int result = MaxSumSubArray.calculate(sample, size);
        assertEquals(expected, result);
    }

    Stream<Arguments> samples() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 5, 1, 3, 2}, 3, 9),
                Arguments.of(new int[]{1, 1, 1}, 2, 2),
                Arguments.of(new int[]{5, 2, 1, 8, 9}, 3, 18)
        );
    }

}