package org.examples.removeDuplicates;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.examples.removeDuplicates.RemoveDuplicates.removeDuplicates;

class RemoveDuplicatesTest {

    @ParameterizedTest
    @MethodSource("testData")
    void removeDuplicatesTest(int[] nums, int[] expectedNums) {
        int k =
                removeDuplicates(nums);
        assertThat(k).isEqualTo(expectedNums.length);
        for (int i = 0; i < k; i++) {
            assertThat(nums[i]).isEqualTo(expectedNums[i]);
        }
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{0,0,1,1,1,2,2,3,3,4}, new int[]{0,1,2,3,4})
        );
    }
}