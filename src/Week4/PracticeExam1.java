package Week4;

import java.util.Arrays;

/* Write a static method:
public static int[] rotateRight(int[] arr, int k)

It returns a new array with the elements of arr rotated right by k positions.
Rules:
•	k may be larger than arr.length.
•	Assume arr.length >= 1.
•	Do not modify the original array.
Example: rotateRight({10,20,30,40,50}, 2) returns {40,50,10,20,30}
Write your solution below.
 */
public class PracticeExam1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int key = 5;
        System.out.println("Rotated array by " + key + " positions to right is: " + Arrays.toString(rotateRight(arr, key)));
        
    }
    public static int[] rotateRight(int[] arr, int k) {
        int n = arr.length;
        int[] out = new int[n];

        // Normalize k in case it's bigger than n (and this also handles negative k safely)
        k = ((k % n) + n) % n;

        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            out[newIndex] = arr[i];
        }

        return out;
    }

}
