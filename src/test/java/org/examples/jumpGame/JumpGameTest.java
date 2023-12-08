package org.examples.jumpGame;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.examples.jumpGame.JumpGame.canJump;

class JumpGameTest {

    @ParameterizedTest
    @MethodSource("testData")
    void canJumpTest(int[] nums, boolean expectedResult) {
        assertThat(canJump(nums)).isEqualTo(expectedResult);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1, 1, 4}, true),
                Arguments.of(new int[]{3, 2, 1, 0, 4}, false),
                Arguments.of(new int[]{0}, true),
                Arguments.of(new int[]{2, 0, 0}, true)
        );
    }
}