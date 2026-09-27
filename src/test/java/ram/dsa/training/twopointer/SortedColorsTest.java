package ram.dsa.training.twopointer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SortedColorsTest {

    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    public void test1(int[] sampleArray, int[] expectedArray) {
        int[] result = SortedColors.sort(sampleArray);
        assertArrayEquals(expectedArray, result);
    }

    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 2, 0, 1, 0, 1, 0, 1}, new int[]{0, 0, 0, 1, 1, 1, 1, 2, 2}),
                Arguments.of(new int[]{2, 0, 1}, new int[]{0, 1, 2}),
                Arguments.of(new int[]{0, 2, 1, 2, 0, 1}, new int[]{0, 0, 1, 1, 2, 2})
        );
    }
}