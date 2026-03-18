package Week9;

import Week7.*;

public class EmployeeMain3 {
    public static void main(String[] args) {
        Lawyer law= new Lawyer(20);
        Secretary sec= new Secretary(10);
        printInfo(law);
        printInfo(sec);
    }
	
    public static void printInfo(Employee empl){
        System.out.println(	empl.getSalary());
        System.out.println(empl.getVacationDays());
        System.out.println(empl.getVacationForm());   
    }
}


