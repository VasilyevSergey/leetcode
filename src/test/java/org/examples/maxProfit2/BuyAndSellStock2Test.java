package org.examples.maxProfit2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.examples.maxProfit2.BuyAndSellStock2.maxProfit2;

class BuyAndSellStock2Test {

    @ParameterizedTest
    @MethodSource("testData")
    void maxProfit2Test(int[] prices, int expectedMaxProfit) {
        int maxProfit = maxProfit2(prices);
        assertThat(maxProfit).isEqualTo(expectedMaxProfit);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 7),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{6, 1, 3, 2, 4, 7}, 7)
        );
    }
}