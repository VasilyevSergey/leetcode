package org.examples.mergeSortedArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.examples.mergeSortedArray.MergeSortedArray.merge;

class MergeSortedArrayTest {

    @ParameterizedTest
    @MethodSource("testData")
    void mergeTest(int[] nums1, int m, int[] nums2, int n, int[] expectedNums1) {
        merge(nums1, m, nums2, n);
        assertThat(nums1).isEqualTo(expectedNums1);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6}),
                Arguments.of(new int[]{1}, 1, new int[]{}, 0, new int[]{1}),
                Arguments.of(new int[]{0}, 0, new int[]{1}, 1, new int[]{1}),
                Arguments.of(new int[]{2, 0}, 1, new int[]{1}, 1, new int[]{1, 2}),
                Arguments.of(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3, new int[]{1, 2, 3, 4, 5, 6}),
                Arguments.of(new int[]{-1, 0, 0, 3, 3, 3, 0, 0, 0}, 6, new int[]{1, 2, 2}, 3, new int[]{-1, 0, 0, 1, 2, 2, 3, 3, 3})
        );
    }
}