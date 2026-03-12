package Week7;

public class Lawyer extends Employee {
	public Lawyer(int years){
		super(years);
	}
// overrides getVacationForm method in Employee class
	public String getVacationForm() {
		return "pink";
	}

// overrides getVacationDays method in Employee class
    public int getVacationDays() {
        return 15;           // 3 weeks' paid vacation
    }

    public void sue() {
		System.out.println("Suing.....");;
	}

	public double getSalary(){
		return super.getSalary() + 5000 * getYears();

	}
}

