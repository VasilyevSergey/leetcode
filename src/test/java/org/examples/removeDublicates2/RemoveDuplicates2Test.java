package org.examples.removeDublicates2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.examples.removeDublicates2.RemoveDuplicates2.removeDuplicates2;

class RemoveDuplicates2Test {

    @ParameterizedTest
    @MethodSource("testData")
    void removeDuplicates2Test(int[] nums, int[] expectedNums) {
        int k = removeDuplicates2(nums);
        assertThat(k).isEqualTo(expectedNums.length);
        for (int i = 0; i < k; i++) {
            assertThat(nums[i]).isEqualTo(expectedNums[i]);
        }
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1, 2, 2, 3}, new int[]{1, 1, 2, 2, 3}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 3, 3}),
                Arguments.of(new int[]{1}, new int[]{1})
        );
    }
}