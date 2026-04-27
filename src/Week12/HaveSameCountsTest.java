package Week12;

import java.util.HashMap;
import java.util.Map;

public class HaveSameCountsTest {
        public static boolean haveSameCounts(String s1, String s2) {
        // if (s1.length() != s2.length()) {
        //     return false;
        // }

        // Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        // Map<Character, Integer> map2 = new HashMap<Character, Integer>();

        // for (int i = 0; i < s1.length(); i++) {
        //     char ch = s1.charAt(i);
        //     if (map1.containsKey(ch)) {
        //         map1.put(ch, map1.get(ch) + 1);
        //     } else {
        //         map1.put(ch, 1);
        //     }
        // }

        // for (int i = 0; i < s2.length(); i++) {
        //     char ch = s2.charAt(i);
        //     if (map2.containsKey(ch)) {
        //         map2.put(ch, map2.get(ch) + 1);
        //     } else {
        //         map2.put(ch, 1);
        //     }
        // }

        // return map1.equals(map2);

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (counts.containsKey(ch)) {
                counts.put(ch, counts.get(ch) + 1);
            } else {
                counts.put(ch, 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            if (!counts.containsKey(ch)) {
                return false;
            }

            counts.put(ch, counts.get(ch) - 1);

            if (counts.get(ch) == 0) {
                counts.remove(ch);
            }
        }

        return counts.isEmpty();

    }


    public static void main(String[] args) {
        System.out.println("Testing haveSameCounts:");
        System.out.println("haveSameCounts(\"aabbc\", \"bcaab\") -> " +
                haveSameCounts("aabbc", "bcaab")); // true

        System.out.println("haveSameCounts(\"hello\", \"olelh\") -> " +
                haveSameCounts("hello", "olelh")); // true

        System.out.println("haveSameCounts(\"java\", \"avaj\") -> " +
                haveSameCounts("java", "avaj")); // true

        System.out.println("haveSameCounts(\"aabc\", \"abcc\") -> " +
                haveSameCounts("aabc", "abcc")); // false

        System.out.println("haveSameCounts(\"cat\", \"cats\") -> " +
                haveSameCounts("cat", "cats")); // false

        System.out.println("haveSameCounts(\"\", \"\") -> " +
                haveSameCounts("", "")); // true

        System.out.println("haveSameCounts(\"aaa\", \"aaa\") -> " +
                haveSameCounts("aaa", "aaa")); // true

        System.out.println("haveSameCounts(\"abc\", \"abd\") -> " +
                haveSameCounts("abc", "abd")); // false
    }



}
