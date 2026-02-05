package Week4;

import java.util.Arrays;

public class MyProgram {
    public static void main(String[] args) {
        int[] iq = {126, 84, 149, 167, 95};
	    double avg = average(iq);
	    System.out.println("Average IQ = " + avg);

        int[] stuttered = stutter(iq);
        System.out.println(Arrays.toString(stuttered));
        System.out.println("Length of duplicated array is: "+Arrays.toString(stuttered).length());

        for(int i =0; i< stuttered.length;i++){
            System.out.print(stuttered[i]+", ");
        }
        System.out.println();
        increase(iq);
        for(int i =0; i< iq.length;i++){
            System.out.print(iq[i]+", ");
        }
        System.out.println();

        int index = linearSearch(iq, 1000);
        if (index<0) {
            System.out.println("IQ not found!");
        }
        else{
            System.out.println("IQ found at index "+ index);
        }



	}


    public static double average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }


    public static int[] stutter(int[] numbers) {
	    int[] result = new int[2 * numbers.length];
	    for (int i = 0; i < numbers.length; i++) {
	        result[2 * i]     = numbers[i];
	        result[2 * i + 1] = numbers[i];
	    }
	    return result;
	}

    public static void increase(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
        }
    }

    public static int linearSearch(int[] arr, int key) {
	
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
