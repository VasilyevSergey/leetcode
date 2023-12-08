package org.examples.majorityElement;

import java.util.HashMap;
import java.util.Map;

/**
 * Дан массив целых чисел nums размера n. Нужно вернуть элемент, который встречается не меньше [n / 2] раз в массиве.
 * В тестовых данных такой элемент всегда существует.<p/>
 * Пример 1: <p>
 * Вход: nums = [3,2,3] <p>
 * Выход: 3 <p>
 * Пример 2: <p>
 * Вход: nums = [2,2,1,1,1,2,2] <p>
 * Выход: 2<p/>
 * Ограничения: <p>
 * 1 <= n <= 5 * 10^4 <p>
 * -10^9 <= nums[i] <= 10^9
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int border = nums.length / 2;
        HashMap<Integer, Integer> elements = new HashMap<>();
        for (Integer num : nums) {
            elements.put(num, elements.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> element : elements.entrySet()) {
            if (element.getValue() > border) {
                return element.getKey();
            }
        }

        return 0;
    }
}
