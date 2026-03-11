package Week7;

public class EmployeeMain {

	public static void main(String[] args) {
	   System.out.print("Employee:");
	   Employee employee1 = new Employee(6);
	   System.out.print(employee1.getHours() + ", ");
	   System.out.printf("$%.2f, ", employee1.getSalary());
	   System.out.print(employee1.getVacationDays() + ", ");
	   System.out.println(employee1.getVacationForm());
		
	   System.out.print("Secretary: ");
	   Secretary employee2 = new Secretary();
	   System.out.print(employee2.getHours() + ", ");
	   System.out.printf("$%.2f, ", employee2.getSalary());
	   System.out.print(employee2.getVacationDays() + ", ");
	   System.out.println(employee2.getVacationForm());
	   employee2.takeDictation("CS12b example");

    //    System.out.print("Lawyer: ");
	//    Lawyer employee3 = new Lawyer();
	//    System.out.print(employee3.getHours() + ", ");
	//    System.out.printf("$%.2f, ", employee3.getSalary());
	//    System.out.print(employee3.getVacationDays() + ", ");
	//    System.out.println(employee3.getVacationForm());

       System.out.print("Marketer: ");
	   Marketer employee5 = new Marketer(3);
	   System.out.print(employee5.getSalary() + "\n ");

    //    System.out.print("Legal Secretary: ");
	//    LegalSecretary employee5 = new LegalSecretary();
	//    System.out.print(employee5.getSalary() + "\n ");

       System.out.println("Lawyer:");
	   Lawyer employee3 = new Lawyer(2);
	   System.out.print(employee3.getHours() + ", ");
	   System.out.printf("$%.2f, ", employee3.getSalary());
	   System.out.print(employee3.getVacationDays() + ", ");
	   System.out.println(employee3.getVacationForm());
       employee3.sue();
		
	   System.out.print("Legal Secretary: ");
	   LegalSecretary employee4 = new LegalSecretary();
	   System.out.print(employee4.getHours() + ", ");
	   System.out.printf("$%.2f, ", employee4.getSalary());
	   System.out.print(employee4.getVacationDays() + ", ");
	   System.out.println(employee4.getVacationForm());
	   employee4.takeDictation("CS12b example");
       employee4.fileLegalBriefs();

	}
}


