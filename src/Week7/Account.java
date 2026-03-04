package Week7;

public class Account { 
    private int account_number; 
    private int account_balance; 
    public void deposit(int a) {
        if (a < 0){
            System.out.println("error");
        } else {
            account_balance = account_balance + a; 
        } 

    } 
} 


