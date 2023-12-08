package org.examples.mergeSortedArray;

/**
 * Дано два целочисленных массива nums1 и nums2, отсортированные в порядке неубывания, и два целых числа m и n,
 * представляющие количество элементов в nums1 и nums2 соответственно. <p>
 * Объедините nums1 и nums2 в один массив, отсортированный в неубывающем порядке.<p>
 * Окончательно отсортированный массив не должен возвращаться функцией, а должен храниться внутри массива nums1.
 * Чтобы учесть это, nums1 имеет длину m + n, где первые m элементов обозначают элементы, которые следует объединить,
 * а последние n элементов имеют значение 0 и их следует игнорировать. nums2 имеет длину n.<p/>
 * Пример 1:<p>
 * Вход: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3<p>
 * Выход: [1,2,2,3,5,6]<p>
 * Пример 2:<p>
 * Вход: nums1 = [1], m = 1, nums2 = [], n = 0<p>
 * Выход: [1] <p/>
 * Ограничения: <p>
 * nums1.length == m + n <p>
 * nums2.length == n <p>
 * 0 <= m, n <= 200 <p>
 * 1 <= m + n <= 200 <p>
 * -10^9 <= nums1[i], nums2[j] <= 10^9
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) {
            return;
        }

        int num1Counter = 0;
        int num2Counter = 0;
        for (int i = 0; i < m + n; i++) {
            if (num2Counter == n) {
                break;
            }
            if (num1Counter >= m + num2Counter) {
                nums1[num1Counter] = nums2[num2Counter];
                num1Counter++;
                num2Counter++;
                continue;
            }
            if (nums1[num1Counter] > nums2[num2Counter]) {
                // вставляем в nums1 элемент из nums2
                // для этого передвигаем все последующие элементы массива вправо на 1,
                // а на освободившееся место вставляем новый элемент
                // сейчас рассматриваем num1Counter'й элемент, надо передвинуть все элементы
                int elementsToMoveCounter = m + num2Counter - num1Counter;

                for (int j = i + elementsToMoveCounter; j > i; j--) {
                    nums1[j] = nums1[j - 1];
                }
                nums1[num1Counter] = nums2[num2Counter];

                num1Counter++;
                num2Counter++;
            } else {
                // оставляем старый элемент на месте
                num1Counter++;
            }
        }

        /* Альтернатива - тупое решение с копированием массива и сортировкой
        if (n >= 0) {
            System.arraycopy(nums2, 0, nums1, m, n);
        }
        Arrays.sort(nums1);*/
    }
}
