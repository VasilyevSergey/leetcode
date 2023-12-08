package org.examples.removeElement;

/**
 * Дан массив целых чисел nums и целое число val. Необходимо удалить все вхождения val в nums in-place (без создания
 * отдельной копии nums). Необходимо вернуть количество элементов массива чисел k, которые не равны val.
 * Порядок элементов массива nums необходимо изменить таким образом, чтобы первые k элементов были не равны val.<p/>
 * <p>
 * Пример 1:<p>
 * Вход: nums = [3,2,2,3], val = 3 <p>
 * Выход: 2, nums = [2,2,_,_] <p>
 * <p>
 * Пример 2: <p>
 * Вход: nums = [0,1,2,2,3,0,4,2], val = 2 <p>
 * Выход: 5, nums = [0,1,4,0,3,_,_,_] <p/>
 * <p>
 * Ограничения: <p>
 * 0 <= nums.length <= 100 <p>
 * 0 <= nums[i] <= 50 <p>
 * 0 <= val <= 100
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
