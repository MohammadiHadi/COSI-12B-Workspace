package Week4;

// This solution does not work!
import java.io.*;               // for File
import java.util.*;             // for Scanner
public class HoursWorked {
  public static void main(String[] args) throws FileNotFoundException {
     Scanner input = new Scanner(new File("hours.txt"));
     PrintStream output = new PrintStream(new File("hours_out.txt"));
    //  while (input.hasNext()) {
    //     // process one person
    //     int id = input.nextInt();
    //     String name = input.next();
    //     double totalHours = 0.0;
    //     int days = 0;
    //     while (input.hasNextDouble()) {
    //        totalHours += input.nextDouble();
    //        days++;
    //     }
    //     System.out.println(name + " (ID#" + id + ") worked " + totalHours + " hours (" + (totalHours / days) + " hours/day)");
    //  }

    
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);
            int id = lineScan.nextInt();          // e.g. 456
            String name = lineScan.next();        // e.g. "Eric"
            double sum = 0.0;
            int count = 0;
            while (lineScan.hasNextDouble()) {
                sum = sum + lineScan.nextDouble();
                count++;
            }			
            double average = sum / count;
            output.println(name + " (ID#" + id + ") worked " +
			sum + " hours (" + average + " hours/day)");
        }
  }
}


