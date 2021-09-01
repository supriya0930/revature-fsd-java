
public class Transaction {

	private char type;  //define instance variable(type and amount) as private, as it 
	                      //will access only within class
	private double amount;

	// constructor..it helps in initialising the data for transaction class
	public Transaction(char type, double amount) {
		this.type = type;  //this refers to current object instance variable
		this.amount = amount;
	}
 
	
	//instance method
	public void displayTransaction(double balance) {
		System.out.printf("%4c %12.2f %8.2f\n", type, amount, balance);
	}

	public static void main(String args[]) {
		Transaction transaction1 = new 	Transaction('W', 2000);
		Transaction transaction2 = new  Transaction('D', 20000);
		Transaction transaction3 = new 	Transaction('D', 500);
		Transaction transaction4 = new 	Transaction('W', 15500);
		Transaction transaction5 = new 	Transaction('W', 10000);
		
		//flaoat[] scores =  {48, 55, 78, 25, 22};
		Transaction[] transactionArray = { transaction1, transaction2, transaction3, transaction4, transaction5};
		
		for (Transaction transaction : transactionArray) {
		transaction.displayTransaction(5000);
	}
	}	
}


