package Week12;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        ListIterator<String> iterator = fruits.listIterator();
        // Traverse forward
        System.out.println("Forward traversal:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            if ("Banana".equals(fruit)) {
            iterator.add("Blueberry");
        }
        }
        System.out.println("\nList after modification: " + fruits);
        System.out.println("\nBackward traversal:");
        while (iterator.hasPrevious()) {
        String fruit = iterator.previous();
        System.out.println(fruit);
        if ("Cherry".equals(fruit)) {
        iterator.set("Cantaloupe");
        }
        }
        System.out.println("\nFinal list: " + fruits);
    }
}

