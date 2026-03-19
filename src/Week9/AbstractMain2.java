package Week9;

abstract class Fruit { 
	private String color; 
	private boolean seasonal; 

	protected Fruit(String color, boolean seasonal) { 
		this.color = color; 
		this.seasonal = seasonal; 
	} 

	public abstract void prepare(); 

	public String getColor() { 
		return color; 
	} 

	public boolean isSeasonal() { 
		return seasonal;
	} 

}


class Mango extends Fruit { 

      	public Mango(String color, boolean seasonal) { 
		super(color, seasonal); 
      	} 

	public void prepare() { 
		System.out.println("Cut the Mango"); 
	} 
} 

	
class Banana extends Fruit { 

	public Banana(String color, boolean seasonal) { 
		super(color, seasonal); 	
	} 
	
	public void prepare() { 
		System.out.println("Peal the Banana"); 
	} 
}


public class AbstractMain2{
    public static void main(String[] args) {
		Mango mn = new Mango("yellow", false);
		mn.prepare();

        
    }
}

