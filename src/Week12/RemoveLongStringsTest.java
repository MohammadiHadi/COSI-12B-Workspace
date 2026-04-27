package Week12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveLongStringsTest {

    public static void removeLongStrings(List<String> list, int maxLength) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).length() > maxLength) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }

    // Optional second correct solution using Iterator
    public static void removeLongStringsIterator(List<String> list, int maxLength) {
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            if (itr.next().length() > maxLength) {
                itr.remove();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Testing removeLongStrings:");

        List<String> list1 = new ArrayList<>(Arrays.asList("hi", "computer", "cat", "notebook", "sun"));
        System.out.println("Before: " + list1);
        removeLongStrings(list1, 3);
        System.out.println("After removeLongStrings(list1, 3): " + list1);
        // expected: [hi, cat, sun]

        List<String> list2 = new ArrayList<>(Arrays.asList("a", "bb", "ccc", "dddd", "ee"));
        System.out.println("\nBefore: " + list2);
        removeLongStrings(list2, 2);
        System.out.println("After removeLongStrings(list2, 2): " + list2);
        // expected: [a, bb, ee]

        List<String> list3 = new ArrayList<>(Arrays.asList("apple", "dog", "tree", "x"));
        System.out.println("\nBefore: " + list3);
        removeLongStrings(list3, 4);
        System.out.println("After removeLongStrings(list3, 4): " + list3);
        // expected: [dog, tree, x]

        List<String> list4 = new ArrayList<>(Arrays.asList("one", "two", "six"));
        System.out.println("\nBefore: " + list4);
        removeLongStrings(list4, 10);
        System.out.println("After removeLongStrings(list4, 10): " + list4);
        // expected: [one, two, six]

        List<String> list5 = new ArrayList<>(Arrays.asList("longword", "anotherlongword"));
        System.out.println("\nBefore: " + list5);
        removeLongStrings(list5, 3);
        System.out.println("After removeLongStrings(list5, 3): " + list5);
        // expected: []

        System.out.println("\nTesting iterator-based version:");

        List<String> list6 = new ArrayList<>(Arrays.asList("hi", "computer", "cat", "notebook", "sun"));
        System.out.println("Before: " + list6);
        removeLongStringsIterator(list6, 3);
        System.out.println("After removeLongStringsIterator(list6, 3): " + list6);
        // expected: [hi, cat, sun]
    }
}

