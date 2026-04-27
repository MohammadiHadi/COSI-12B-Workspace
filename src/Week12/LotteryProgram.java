package Week12;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LotteryProgram {
    public static final int NUMBERS = 6;
    public static final int MAX_NUMBER = 40;

    public static Set<Integer> createWinningNumbers() {
            Set<Integer> winningNumbers = new TreeSet<Integer>();
            Random r = new Random();
            while (winningNumbers.size() < NUMBERS) {
                int number = r.nextInt(MAX_NUMBER) + 1;
                winningNumbers.add(number);
            }
            return winningNumbers;
    }

    // reads the player's lottery ticket from the console
    public static Set<Integer> getTicket() {
        Set<Integer> ticket = new TreeSet<Integer>();
        Scanner console = new Scanner(System.in);
        System.out.print("Type your " + NUMBERS + " unique lotto numbers: ");
        while (ticket.size() < NUMBERS) {
                int number = console.nextInt();
                ticket.add(number);
        }
        return ticket;
    }



    public static void main(String[] args) {
        Set<Integer> winningNumbers = createWinningNumbers();
        Set<Integer> ticket = getTicket();
                    
        // keep only the winning numbers from the user's ticket
        Set<Integer> intersection = new TreeSet<Integer>(ticket);
        intersection.retainAll(winningNumbers);

        if (intersection.size() > 0) {
            double prize = 100 * intersection.size();
            System.out.println("The matched numbers are " + intersection);
            System.out.println("The winning numbers are " + winningNumbers);

            System.out.println("Your prize is $" + prize);
        }


        
    }


}
