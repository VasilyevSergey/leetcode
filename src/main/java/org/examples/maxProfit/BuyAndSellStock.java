package org.examples.maxProfit;

/**
 * Дан массив целых чисел prices, где prices[i] - цена ценной бумаги в i-ый день. Вы хотите максимизировать вашу прибыль,
 * выбирая один день для покупки акции и другой день в будущем для продажи акции. Нужно вернуть максимально возможную
 * прибыль, или 0, если получить прибыль не возможно. <p/>
 * Пример 1: <p>
 * Вход: prices = [7,1,5,3,6,4] <p>
 * Выход: 5 <p>
 * Пример 2: <p>
 * Вход: prices = [7,6,4,3,1] <p>
 * Выход: 0<p/>
 * Ограничения: <p>
 * 1 <= prices.length <= 10^5
 * 0 <= prices[i] <= 10^4
 */
public class BuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length == 1) {
            return maxProfit;
        }

        int currMaxPrice = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            if (currMaxPrice <= prices[i]) {
                currMaxPrice = prices[i];
            } else {
                int diff = currMaxPrice - prices[i];
                if (diff > maxProfit) {
                    maxProfit = diff;
                }
            }
        }

        return maxProfit;
    }
}
