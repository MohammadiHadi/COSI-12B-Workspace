package Week2;

public class EvenDigits {
    public static void main(String[] args) {
        System.out.println("Number of even digits: " + countEvenDigits(123456));
        System.out.println("Number of even digits: " + countEvenDigits(13579));
        System.out.println("Number of even digits: " + countEvenDigits(24680));
       
    }

    public static int countEvenDigits(int number) {
        int count = 0;
        while(number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        }
        return count;

        // while (number > 0) {
        // if (number % 2 == 0) {
        //         count++;
        //     }
        //     number = number / 10;
        // }
        // return count;
    }

}
