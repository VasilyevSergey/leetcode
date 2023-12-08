package org.examples.hirschmanIndex;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.examples.hirschmanIndex.HirshmanIndex.hIndex;

class HirshmanIndexTest {

    @ParameterizedTest
    @MethodSource("testData")
    void hIndexTest(int[] nums, int expectedHIndex) {
        assertThat(hIndex(nums)).isEqualTo(expectedHIndex);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{3, 0, 6, 1, 5}, 3),
                Arguments.of(new int[]{1, 3, 1}, 1),
                Arguments.of(new int[]{100}, 1),
                Arguments.of(new int[]{4, 4, 0, 0}, 2)
        );
    }
}