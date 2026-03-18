package Week9;

import Week7.*;

public class EmployeeMain4 {
    public static void main(String[] args) {
        Employee[] e = {new Lawyer(2), new Secretary(3), 
                        new Marketer(4), new Employee(1) };
        for (int i = 0; i < e.length; i++) {
             System.out.println(e[i]);
            System.out.println(e[i].getSalary());
            System.out.println(e[i].getVacationDays());
            System.out.println();
        }
    }
}

