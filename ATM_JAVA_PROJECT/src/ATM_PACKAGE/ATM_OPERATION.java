package ATM_PACKAGE;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ATM_OPERATION extends ATM implements ATM_OPERATION_INTERFACE {
	ATM O = new ATM();
	Map<Double, String> mini_statement = new HashMap<>();

	@Override
	public void view_balance() {
		System.out.println("YOUR CURRENT BALANCE IS :" + O.get_balance());
		System.out.println();
	}

	@Override
	public void withdraw_amount(double withdraw_amount) {
		Scanner sc = new Scanner(System.in);
		if (withdraw_amount % 100 == 0) {
			if (withdraw_amount <= O.get_balance()) {
				System.out.println("confirm?\n 1.yes \n 2.no");
				int confirm = sc.nextInt();
				if (confirm == 1) {
					mini_statement.put(withdraw_amount, "amount withdraw");
					System.out.println("collect your amount" + withdraw_amount);
					O.set_balance(O.get_balance() - withdraw_amount);
					view_balance();
				} else if (confirm == 2) {
					System.out.println("thankyou for using atm machine");
					System.exit(0);
				} else {
					System.out.println("insufficient balance");
				}
			} else {
				System.out.println("please enter amount in 100 multiple");
			}
		}
	}

	@Override
	public void deposite_amount(double deposite_amount) {
		Scanner sc = new Scanner(System.in);
		System.out.println("confirm?\n 1.yes \n 2.no");
		int confirm = sc.nextInt();
		if (confirm == 1) {
			mini_statement.put(deposite_amount, "amount deposite");
			System.out.println("deposite amount" + deposite_amount);
			O.set_balance(O.get_balance() + deposite_amount);
			view_balance();
		} else if (confirm == 2) {
			System.out.println("thankyou for using atm machine");
			System.exit(0);
		}
	}

	@Override
	public void view_mini_statement() {
		for (Entry<Double, String> M : mini_statement.entrySet()) {
			System.out.println(M.getKey() + M.getValue());
		}
	}

}
