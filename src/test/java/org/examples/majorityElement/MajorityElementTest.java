package org.examples.majorityElement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.examples.majorityElement.MajorityElement.majorityElement;

class MajorityElementTest {

    @ParameterizedTest
    @MethodSource("testData")
    void majorityElementTest(int[] nums, int expectedMajorityElement) {
        int majorityElement = majorityElement(nums);
        assertThat(majorityElement).isEqualTo(expectedMajorityElement);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, 3),
                Arguments.of(new int[]{2, 2, 1, 1, 1, 2, 2}, 2)
        );
    }
}