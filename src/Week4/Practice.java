package Week4;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {11, 42, -5, 27, 0, 89};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Most frequent didgit in the number is: " + mostFrequentDigit(111239999));
        for (int i = arr.length - 1; i >= 1; i--) {
		    arr[i] = arr[i - 1];
        }  
        arr[0]=0;
        System.out.println("Array after shifting its elements to the right: "+ Arrays.toString(arr));    
    }

    public static void reverse(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
                int temp = numbers[i];
                numbers[i] = numbers[numbers.length - 1 - i];
                numbers[numbers.length - 1 - i] = temp;    
        }
    }

    public static int mostFrequentDigit(int n) {
        int[] counts = new int[10];
        int digit = 0;
        while (n > 0) {
            digit = n % 10;  // pluck off a digit and tally it
            counts[digit]++;
            n = n / 10;
        }  
        // find the most frequently occurring digit
        int bestIndex = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > counts[bestIndex]) {
                bestIndex = i;
            }
        }   
        return bestIndex;
    }

}
