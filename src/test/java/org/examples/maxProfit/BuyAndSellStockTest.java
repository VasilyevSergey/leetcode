package org.examples.maxProfit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.examples.maxProfit.BuyAndSellStock.maxProfit;

class BuyAndSellStockTest {

    @ParameterizedTest
    @MethodSource("testData")
    void maxProfitTest(int[] prices, int expectedMaxProfit) {
        int maxProfit = maxProfit(prices);
        assertThat(maxProfit).isEqualTo(expectedMaxProfit);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0)
        );
    }
}