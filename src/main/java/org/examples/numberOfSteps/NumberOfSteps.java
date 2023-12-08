package org.examples.numberOfSteps;

/**
 * Given an integer num, return the number of steps to reduce it to zero. In one step, if the current number is even,
 * you have to divide it by 2, otherwise, you have to subtract 1 from it.
 * <p>
 * Example:<p>
 * Input: num = 14<p>
 * Output: 6<p>
 * Explanation:<p>
 * Step 1) 14 is even; divide by 2 and obtain 7.<p>
 * Step 2) 7 is odd; subtract 1 and obtain 6.<p>
 * Step 3) 6 is even; divide by 2 and obtain 3.<p>
 * Step 4) 3 is odd; subtract 1 and obtain 2.<p>
 * Step 5) 2 is even; divide by 2 and obtain 1.<p>
 * Step 6) 1 is odd; subtract 1 and obtain 0.<p>
 * <p>
 * 0 <= num <= 10^6
 */
public class NumberOfSteps {

    public static int numberOfSteps(int num) {
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            step++;
        }
        return step;
    }
}
