package Week7;

// A class to represent legal secretaries
public class LegalSecretary extends Secretary {

    public LegalSecretary(int years) {
        super(years);
    }
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }

    public double getSalary() {
        	double baseSalary = super.getSalary();
	        return baseSalary + 5000.0;

    }
}

