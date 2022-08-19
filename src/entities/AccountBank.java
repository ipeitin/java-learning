package entities;

public class AccountBank {
	
	private String name;
	private int numberAccount;
	private double money;
	
	public AccountBank() {
	}	
	
	public AccountBank(String name, int numberAccount, double initialDeposit) {
		this.name = name;
		this.numberAccount = numberAccount;
		deposit(initialDeposit);
	}	
	
	public AccountBank(String name, int numberAccount) {
		this.name = name;
		this.numberAccount = numberAccount;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberAccount() {
		return numberAccount;
	}
	
	public double getMoney() {
		return money;
	}
	
	public double deposit(double value) {
		money += value;
		return money;
	}
	
	public double withdraw(double value) {
		money -= value + 5;
		return money;
	}

	public String toString() {
		return "Account "
				+ numberAccount
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", money);
	}
	
}
