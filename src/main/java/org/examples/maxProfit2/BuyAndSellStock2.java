package org.examples.maxProfit2;

/**
 * Дан массив целых чисел prices, где prices[i] - цена ценной бумаги в i-ый день. Каждый день вы можете принять решение
 * о покупке и/или продаже акций. Вы можете одновременно владеть не более одной акцией. Однако вы можете купить её и
 * тут же продать в тот же день. Нужно вернуть максимально возможную прибыль <p/>
 * Пример 1: <p>
 * Вход: prices = [7,1,5,3,6,4] <p>
 * Выход: 7 <p>
 * Пример 2: <p>
 * Вход: prices = [7,6,4,3,1] <p>
 * Выход: 0<p/>
 * Пример 3: <p>
 * Вход: prices = [1,2,3,4,5] <p>
 * Выход: 4<p/>
 * Ограничения: <p>
 * 1 <= prices.length <= 10^5
 * 0 <= prices[i] <= 10^4
 */
public class BuyAndSellStock2 {

    public static int maxProfit2(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += (prices[i + 1] - prices[i]);
            }
        }

        return profit;
    }
}
