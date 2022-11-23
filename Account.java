package assignements;

/* Create a new class for a bank account.
 * create fields for account characterstis like:
 * account number 
 * account balance 
 * customer name 
 * email and phone number 
 * create getters and setters for each field
 * create two additional methods: 1) one for depositing funds into the account
 * 2 )one for withdrawing funds from the account
 *  A customer should not be allowed to withdraw funds, if that withdrawal takes their balance negative.
 */




public class Account {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	
	public void depositFunds(double depositAmount) {
		
		balance += depositAmount;
		System.out.println("Deposit of $ " + depositAmount + "made. New balance is $ " + balance);
	
	}
	
	public void withdrawFunds(double withdrawalAmount) {
		if(balance - withdrawalAmount < 0) {
			System.out.println("Insufficient Funds! You only have $");
		}
		else {
			balance -= withdrawalAmount;
			System.out.println("Withdrawal of $" + withdrawalAmount +
					"processed, Remaining balance = $" + balance);
		}
	
	}
	
	public String getNumber() {
		return number;
	}
	public double getBalance() {
		return balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	
	
	public void withdrawal(double withdrawalAmount) {
		if(balance-withdrawalAmount<=0) {
			System.out.println("Only" + balance + "available. Withdrawal not processed");
		} else {
			balance -= withdrawalAmount;
			System.out.println("Withdrawal of" + withdrawalAmount + "processd. Remaining balance = " +this.balance);
			
		}
	}
	
	
	
	public static void main(String[] args) {
	
		Account bobsAccount = new Account("amal", "16686");
		bobsAccount.withdrawFunds(400);
		bobsAccount.depositFunds(200);
		bobsAccount.withdrawFunds(00);
		System.out.println( bobsAccount.customerPhone);
 }

	public Account(String customerName, String customerPhone) {
		super();
		this.customerName = customerName;
		this.customerPhone = customerPhone;
	}
	
}
