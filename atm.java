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
	}
	public void commands() {

		System.out.println("Select a Command: Check Balance");

		String imput;
		imput = reader.nextString();
	}
}