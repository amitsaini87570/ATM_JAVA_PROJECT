package ATM_PACKAGE;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		ATM_OPERATION o = new ATM_OPERATION();

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Select  account type \n 1.saving \n 2.current  \n(saving account number = 12345 ,pin = 1234  \n current account no. = 67890 , pin = 6789)");
		int account_type = sc.nextInt();

		if (account_type == 1) {
			int account_no1 = 12345;
			int atm_pin1 = 1234;
			System.out.println("enter your saving account no");
			int an1 = sc.nextInt();
			if (an1 == account_no1) {
				System.out.println("enter your pin");
				int pin1 = sc.nextInt();
				if (atm_pin1 == pin1) {

					while (true) {
						System.out.println(
								"welcome to your saving account \n press key \n 1.balance \n 2. withdraw \n 3.deposite \n 4.mini statement \n 5.exit");

						int choice = sc.nextInt();
						if (choice == 1) {
							o.view_balance();
						}

						else if (choice == 2) {
							System.out.println("enter amount to withdraw");
							double withdraw_amount = sc.nextDouble();
							o.withdraw_amount(withdraw_amount);
						}

						else if (choice == 3) {
							System.out.println("enter amount to deposite");
							double deposite_amount = sc.nextDouble();
							o.deposite_amount(deposite_amount);
						}

						else if (choice == 4) {
							System.out.println("mini statement of saving account  \n xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
							o.view_mini_statement();
						}

						else if (choice == 5) {
							System.out.println("collect your atm card \n thank you");
							System.exit(0);

						}
					}
				}

				else {
					System.out.println("incorrect pin");
					System.exit(0);
				}
			}

			else {
				System.out.println("incorrect account no.");
				System.exit(0);

			}
		}

		if (account_type == 2) {
			int account_no2 = 67890;
			int atm_pin2 = 6789;
			System.out.println("enter your current account no");
			int an2 = sc.nextInt();
			if (an2 == account_no2) {
				System.out.println("enter your pin");
				int pin2 = sc.nextInt();
				if (atm_pin2 == pin2) {

					while (true) {
						System.out.println(
								"welcome to your saving account \n press key \n 1.balance \n 2. withdraw \n 3.deposite \n 4.mini statement \n 5.exit");

						int choice = sc.nextInt();
						if (choice == 1) {
							o.view_balance();
						}

						else if (choice == 2) {
							System.out.println("enter amount to withdraw");
							double withdraw_amount = sc.nextDouble();
							o.withdraw_amount(withdraw_amount);
						}

						else if (choice == 3) {
							System.out.println("enter amount to deposite");
							double deposite_amount = sc.nextDouble();
							o.deposite_amount(deposite_amount);
						}

						else if (choice == 4) {
							System.out.println("mini statement of saving account  \n xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
							o.view_mini_statement();
						}

						else if (choice == 5) {
							System.out.println("collect your atm card \n thank you");
							System.exit(0);

						}
					}
				}

				else {
					System.out.println("incorrect pin");
					System.exit(0);
				}
			}

			else {
				System.out.println("incorrect account no.");
				System.exit(0);

			}
		}

	}
}
