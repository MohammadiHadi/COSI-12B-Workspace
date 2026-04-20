package Week12;


import java.util.*;

public class RotateExample {
    public static void main(String[] args) {
        // Create a list
        List<Integer> numbers1 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers1.add(i);
        }

        List<Integer> numbers2 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers2.add(i);
        }

        System.out.println("Original List: " + numbers1);

        // Rotate the list to the right by 2 positions
        Collections.rotate(numbers1, 2);
        System.out.println("Rotated List (right by 2): " + numbers1);

        // Rotate the list to the left by 1 position
        Collections.rotate(numbers2, -1);
        System.out.println("Rotated List (left by 1): " + numbers2);
    }
}

