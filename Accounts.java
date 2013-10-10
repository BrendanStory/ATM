public class Accounts {
	
	private String name;
	private int pin;
	private int money;

	public Account(String name, int pin, int money) {

		setName(name);
		setPin(pin);
		setMoney(money);

	}





	public void checkBalance() {
		System.out.println("You currently have " + this.money + "$.");
	}

	public void withdraw(int amount) {
		if(money - amount < 0) {
			System.out.println("Insufficient Funds");
		} else {
			money =- amount;
			System.out.println("Sucsessfully Withdrawn " + amount + "$.");
		}
	}

	public void changeName(String newName) {
		this.name = newName;
		System.out.println("Name changed to: " + newName + ".");
	}

	public void changePin(int newPin) {
		this.pin = newPin;
		System.out.println("Pin changed to: " + newPin + ".");
	}

	public void logout() {
		System.out.println("Thank you for banking for Science! <3");
	}









	public String name() {
		return name;
	}

	public int pin() {
		return pin;
	}

	public int money() {
		return money;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPin(int pin) {
		this.name = pin;
	}

	public void setMoney(int money) {
		this.money = money;
	}





}