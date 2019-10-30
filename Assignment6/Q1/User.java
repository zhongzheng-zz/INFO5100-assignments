package Q1;

public class User {
	private String name;
	private String age;
	private String address;
	private String phoneNumber;
	private String bankAccountNumber;
	private String password;
	private double availableBalance = 0;
	
	
	public User(String name, String age, String address, String phoneNumber, String bankAccountNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.bankAccountNumber = bankAccountNumber;
	}
	
	public User(String bankAccountNumber, String password) {
		this.bankAccountNumber = bankAccountNumber;
		this.password = password;
		this.name = null;
		this.age = null;
		this.address = null;
		this.phoneNumber = null;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
}
