package org.examples.jumpGame;

/**
 * Вам дан массив целых чисел nums. Каждый элемент массива представляет максимальную длину прыжка с этой позиции.
 * Изначально вы находитесь на элементе с первым индексом.
 * Верните true если возможно достичь последней позиции, или false если нельзя. <p/>
 * Пример 1: <p>
 * Вход: nums = [2,3,1,1,4] <p>
 * Выход: true <p>
 * Пример 2: <p>
 * Вход: nums = [3,2,1,0,4] <p>
 * Выход: false <p/>
 * Ограничения: <p>
 * 1 <= nums.length <= 10^4 <p>
 * 0 <= nums[i] <= 10^5
 */
public class JumpGame {

    public static boolean canJump(int[] nums) {
        // мы не сможем дойти до последнего элемента только если в массиве есть ноль, который мы не сможем перепрыгнуть
        // поэтому для каждого нуля достаточно проверить, что его можно перепрыгнуть
        if (nums.length == 1) {
            return true;
        }

        if (nums[0] == 0) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && !canJumpOverZero(nums, i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Проверка, можно ли перепрыгнуть через нулевой элемент. Начиная с элемента index - 1 проверяем элементы в сторону
     * начала массива, будет ли равен индекс элемента + значение элемента больше индекса нулевого элемента.
     * Если да, то нулевой элемент можно перепрыгнуть
     *
     * @param nums  массив чисел
     * @param index индекс нулевого элемента
     * @return можно ли перепрыгнуть нулевой элемент
     */
    private static boolean canJumpOverZero(int[] nums, int index) {
        for (int i = index - 1; i >= 0; i--) {
            if (nums[i] + i > index) {
                return true;
            }
        }
        return false;
    }
}