package OopsConcept;

public class EncapsulationDemo {

	public String accountNumber = "4537893635";
    private double balance = 43332;		
	
    
  /*  public EncapsulationDemo(String accountNumber, double balance) {
    	super();
    	this.accountNumber = accountNumber;
    	this.balance = balance;
    } */
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    EncapsulationDemo account = new EncapsulationDemo();
    System.out.println(account.accountNumber);
    System.out.println(account.balance);
	
		
	}

}
