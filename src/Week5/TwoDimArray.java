package Week5;

import java.util.Arrays;

public class TwoDimArray {
    public static void main (String[] args){
        int[][] arr = {{1, 2, 3}, {3, 4, 5}, {2, 2, 2}};
        print(arr);
        int[] tobesorted = {2, 1, 3};
        bubbleSort(tobesorted);
        System.out.println(Arrays.toString(tobesorted));
    }
    public static void print(int[][] arr) { 
        for (int r = 0; r < arr.length; r++) { 
                for (int c = 0; c < arr[r].length; c++) { 
                System.out.print(arr[r][c] + " ");
                } 
                System.out.println();
        }
    }

    public static void bubbleSort(int[] arr){
        int didswap = 1, tmp = 0;	
        while (didswap == 1) {
            didswap = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    tmp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = tmp;	
                    didswap = 1;
                }
            }
        }
    }

}
