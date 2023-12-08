package org.examples.ransomNote;

import java.util.HashMap;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from
 * magazine and false otherwise.<p>
 * Each letter in magazine can only be used once in ransomNote.<p/>
 * Constraints:<p>
 * 1 <= ransomNote.length, magazine.length <= 10^5 <p>
 * ransomNote and magazine consist of lowercase English letters.<p/>
 * Example 1:<p>
 * Input: ransomNote = "a", magazine = "b"<p>
 * Output: false<p/>
 * Example 2:<p>
 * Input: ransomNote = "aa", magazine = "aab"<p>
 * Output: true
 */
public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char letter = magazine.charAt(i);
            int currentLetterCount = magazineLetters.getOrDefault(letter, 0);
            magazineLetters.put(letter, currentLetterCount + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char letter = ransomNote.charAt(i);
            int currentLetterCount = magazineLetters.getOrDefault(letter, 0);
            if (currentLetterCount == 0) {
                return false;
            }
            magazineLetters.put(letter, currentLetterCount - 1);
        }

        return true;
    }

    /*public static boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            char letter = ransomNote.charAt(i);
            if (magazine.contains(Character.toString(letter))) {
                magazine = magazine.replaceFirst(String.valueOf(letter), "");
            } else {
                return false;
            }
        }
        return true;
    }*/
}
