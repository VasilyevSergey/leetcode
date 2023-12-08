package org.examples.rotateArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.examples.rotateArray.RotateArray.rotate;

class RotateArrayTest {

    @ParameterizedTest
    @MethodSource("testData")
    void rotateTest(int[] nums, int k, int[] expectedNums) {
        rotate(nums, k);
        assertThat(nums).isEqualTo(expectedNums);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}),
                Arguments.of(new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100})
        );
    }
}