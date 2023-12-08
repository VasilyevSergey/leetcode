package org.examples.numberOfSteps;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.examples.numberOfSteps.NumberOfSteps.numberOfSteps;

class NumberOfStepsTest {

    @ParameterizedTest
    @CsvSource(value = {
            "14, 6",
            "8, 4",
            "123, 12"
    })
    void numberOfStepsTest(int num, int expectedNumOfSteps) {
        assertThat(numberOfSteps(num)).isEqualTo(expectedNumOfSteps);
    }
}