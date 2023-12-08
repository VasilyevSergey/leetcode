package org.examples.removeElement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.Arrays.sort;
import static org.assertj.core.api.Assertions.assertThat;
import static org.examples.removeElement.RemoveElement.removeElement;

class RemoveElementTest {

    @ParameterizedTest
    @MethodSource("testData")
    void removeElementTest(int[] nums, int val, int[] expectedNums) {
        int k = removeElement(nums, val);

        assertThat(k).isEqualTo(expectedNums.length);
        sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assertThat(nums[i]).isEqualTo(expectedNums[i]);
        }
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 2, 3}, 3, new int[]{2, 2}),
                Arguments.of(new int[]{0,1,2,2,3,0,4,2}, 2, new int[]{0, 0, 1, 3, 4})
        );
    }
}