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

    // getter method 
	public int getBalance() { 
	   return this.account_balance; 
	} 

	// setter method 
	public void setNumber(int num) { 		   		
        this.account_number = num; 
	} 

} 


