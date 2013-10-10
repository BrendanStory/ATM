import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		
		Account bob = new Account("Bob", 1234, 100);
		Account alice = new Account("Alice", 3333, 250);
		Account jt = new Account("JT", 0001, 999999999);

		int[] account = [bob, alice, jt];

		Scanner reader = new Scanner(System.in);
	}
	
	public void login() {

		String login;
		login = reader.nextString();

		for (i = 0; i < account.length ; i++) {
			
		
			
		}

		int name = 0;
	}
	public void commands() {

		System.out.println("Select a Command: Check Balance, Withdraw,
		 Change Name, Change Pin");

		String imput;
		imput = reader.nextString();

		if (imput == "Check Balance") {
			if (name = 0) {
				bob.checkBalance;
			} else if ( name = 1) {
				alice.checkBalance;
			} else {
				jt.checkBalance;
			}
		} else if ( imput == "Withdraw") {
			System.out.println("Enter amount to Withdraw"); 
			
			double amount = reader.nextInt();

			if (name = 0) {
				bob.withdraw(amount);
			} else if (name = 1) {
				alice.withdraw(amount);
			} else	{
				jt.withdraw(amount);
			}
		}
	}
}