package org.examples.rotateArray;

/**
 * Дан массив целых чисел nums. Нужно сместить элементы массива вправо на k, где k > 0.<p/>
 * Пример 1:<p>
 * Вход: nums = [1,2,3,4,5,6,7], k = 3 <p>
 * Выход: [5,6,7,1,2,3,4] <p>
 * Пример 2:<p>
 * Вход: nums = [-1,-100,3,99], k = 2 <p>
 * Выход: [3,99,-1,-100] <p/>
 * Ограничения:
 * 1 <= nums.length <= 10^5
 * -2^31 <= nums[i] <= 2^31 - 1
 * 0 <= k <= 10^5
 */
public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        // определяем, на сколько позиций нужно сдвинуть элементы, если k больше длины массива
        k = k % length;

        if (k == 0 || length == 1) {
            return;
        }

        // сохраняем последние k элементов в массив
        int[] lastElements = new int[k];
        System.arraycopy(nums, length - k, lastElements, 0, k);

        // двигаем первые (num.length - k) элементы на k позиций вправо
        for (int i = length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // сохраняем в начало массива последние элементы
        System.arraycopy(lastElements, 0, nums, 0, k);
    }
}
