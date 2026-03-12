package Week7;

// A class to represent secretaries
public class Secretary extends Employee{
    public Secretary(int years) {
        super(years);
    }

    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }


    // public int getVacationDays() {
    //     return 10 + getSeniorityBonus(); // 2 weeks' paid vacation plus seniority bonus
    // }
     // Secretaries don't get a bonus for their years of service
    public int getSeniorityBonus() {
        return 0;
    }

}

