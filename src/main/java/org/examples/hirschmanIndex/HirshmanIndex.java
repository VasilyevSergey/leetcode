package org.examples.hirschmanIndex;

import java.util.Arrays;

/**
 * Дан целочисленный массив citations, где citations[i] это количество ссылок на i-ую статью учёного.
 * Необходимо рассчитать и вернуть индекс Хирша для этого учёного. Индекс Хирша рассчитывается таким образом:
 * ученый с индексом h опубликовал как минимум h статей, на каждую из которых сослались как минимум h раз. <p/>
 * Пример 1: <p>
 * Вход: citations = [3,0,6,1,5] <p>
 * Выход: 3 (т.к у трех статей как минимум 3 ссылки) <p>
 * Пример 2: <p>
 * Вход: citations = [1,3,1] <p>
 * Выход: 1 <p/>
 * Ограничения: <p>
 * 1 <= n <= 5000
 * 0 <= citations[i] <= 1000
 */
public class HirshmanIndex {
    public static int hIndex(int[] citations) {
        int hIndex = 0;

        Arrays.sort(citations);

        if (citations[0] >= citations.length) {
            return citations.length;
        }

        for (int i = 0; i < citations.length; i++) {
            int currentHindex = Math.min(citations[i], citations.length - i);
            hIndex = Math.max(hIndex, currentHindex);
        }

        return hIndex;
    }
}
