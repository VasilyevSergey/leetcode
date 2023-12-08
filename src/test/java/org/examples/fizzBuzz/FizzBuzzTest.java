package org.examples.fizzBuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    @ParameterizedTest
    @MethodSource("testData")
    void fizzBuzzTest(int inputNumber, List<String> expectedResult) {
        List<String> result = FizzBuzz.fizzBuzz(inputNumber);
        assertThat(result).isEqualTo(expectedResult);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(3, Arrays.asList("1", "2", "Fizz")),
                Arguments.of(5, Arrays.asList("1", "2", "Fizz", "4", "Buzz")),
                Arguments.of(15, Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"))
        );
    }
}