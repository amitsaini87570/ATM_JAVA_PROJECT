package ATM_PACKAGE;

public class ATM {
 private double balance = 1000; 
 private double withdraw_amount;
 private double deposite_amount;
 
 public void set_balance(double balance) {
	 this.balance = balance;
 }
 
 public double get_balance() {
		return balance;
	}

 public void set_withdraw(double withdraw_amount) {
	this.withdraw_amount =  withdraw_amount;
 }
 
 public double get_withdraw() {
	 return withdraw_amount;
 }
 
 public void set_deposite(double deposite_amount) {
	 this.deposite_amount = deposite_amount;
 }
 
 public double get_deposite() {
	 return deposite_amount;
 }


}
