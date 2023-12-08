package org.examples.fizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * <p>
 * Example 1:
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * <p>
 * Example 2:
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * <p>
 * 1 <= n <= 10^4
 */
public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";

    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            String result = String.valueOf(i);
            if ((i % 3 == 0) && (i % 5 == 0)) {
                result = FIZZBUZZ;
            } else if (i % 3 == 0) {
                result = FIZZ;
            } else if (i % 5 == 0) {
                result = BUZZ;
            }
            answer.add(result);
        }
        return answer;
    }
}
