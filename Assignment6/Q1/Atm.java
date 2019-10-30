package Q1;

import java.util.*;

public class Atm {
	private double availableAmountInMachine;
	private final double transactionFee;
	static HashMap<String, User> userData;
	LinkedList<String> transaction;
	LinkedList<User> currentUser;
	Scanner input = new Scanner(System.in);
	
	public void setAvailableAmoutInMachine(double a) {
		this.availableAmountInMachine = a;
	}
	
	public double getAvailableAmountInMachine() {
		return availableAmountInMachine;
	}
				
	public Atm(int availableAmountInMachine, double transactionFee) {
		this.availableAmountInMachine = availableAmountInMachine;
		this.transactionFee = transactionFee;
		userData = new HashMap<String, User>();
		transaction = new LinkedList<String>();		
		currentUser = new LinkedList<User>();
	}

	
	public void login() {
		
		while(true) {
			System.out.println("Log in, please enter your accountNumber");
			 String an = input.nextLine();
				if(userData.containsKey(an)) {
					System.out.println("please enter your password");
					String pw = input.nextLine();
					if(userData.get(an).getPassword().equals(pw)) {
						System.out.println("login successful");
						currentUser.add(userData.get(an));
						break;
					}
					else {
						System.out.println("wrong password");
						resetPassword();
					}
				}
				else {
					System.out.println("This account number is not exist, you can input 1-creat a new account, 2-reenter your accountNumber");
					an = input.nextLine();
					if(an.equals("1")) {
						creatNewAccount();
					}
					else if(an.equals("2")) {
					}
				}     
		}	
		   
	}
	
	public void creatNewAccount() {
		System.out.println("Creat a new account, please enter your accountNumber: ");
		while(true) {
			String an = input.nextLine();
			if(userData.containsKey(an)) {
				System.out.println("this account already exists, please enter another accountNumber: ");
			}else {
				System.out.println("please set your password: ");
				String pw = input.nextLine();
				User user = new User(an,pw);
				System.out.println("please enter your name: ");
				user.setName(input.nextLine());
				System.out.println("please enter your age: ");
				user.setAge(input.nextLine());
				System.out.println("please enter your address: ");
				user.setAddress(input.nextLine());
				System.out.println("please enter your phoneNumber: ");
				user.setPhoneNumber(input.nextLine());
				userData.put(an, user);	
				System.out.println("account created");
				break;
			}
		}
			
		
	}
	
	public void resetPassword() {
		
		while(true) {
			System.out.println("reset password, please enter your accountNumber: ");
			String an = input.nextLine();
			if(userData.containsKey(an)) {
				System.out.println("please enter your name: ");
				String nm = input.nextLine();
				if(userData.get(an).getName().equals(nm)) {
					System.out.println("please enter your age: ");
					String ag = input.nextLine();
					if(userData.get(an).getAge().equals(ag)) {
						System.out.println("please enter your phoneNumber: ");
						String pn = input.nextLine();
						if(userData.get(an).getPhoneNumber().equals(pn)) {
							System.out.println("please enter your new password");
							String npd = input.nextLine();
							userData.get(an).setPassword(npd);
							System.out.println("reset successful");
							break;
						}
						
					}
				}
				System.out.println("Information incorrect!");
			}
			else {
				System.out.println("account number not found, please check");
				}
		}
	}
	
	private void recentTransactions() {
		if(transaction.size() <= 9 && transaction.size()>0) {
			for(int i = transaction.size() -1; i >= 0; i--) {
				System.out.println(transaction.get(i));
			}
		}
		else if(transaction.size() ==0) {
			System.out.println("no transaction record");
		}
		else {
			for(int i = transaction.size() -1; i >= transaction.size()-10; i--) {
				System.out.println(transaction.get(i));
			}
		}
	}

	private void withDrawal() {
		System.out.println("please enter how much money you want to withdraw: "); 
		double wd = Double.valueOf(input.nextLine());
		double b = currentUser.get(0).getAvailableBalance();
		if(wd > (b - this.transactionFee)) {
			System.out.println("you do not have enough money to withdraw");
		}
		else {
			b = b - wd - this.transactionFee;
			currentUser.get(0).setAvailableBalance(b);
			transaction.add("withDrawal - " + wd);
		    this.availableAmountInMachine = this.availableAmountInMachine - wd;
		}	
	}

	private void deposit() {
		System.out.println("please enter how much money you want to deposit: ");
			double dp = Double.valueOf(input.nextLine());
			double b = currentUser.get(0).getAvailableBalance();
			if(dp >= this.transactionFee) {
				b = b + dp - this.transactionFee;
				currentUser.get(0).setAvailableBalance(b);
				transaction.add("deposit - " + dp);
				this.availableAmountInMachine = this.availableAmountInMachine + dp;

			}
			else {
				System.out.println("please deposit at least 10 dollar");
			}
	}

	private void availableBalance() {
		double b = currentUser.get(0).getAvailableBalance();
		System.out.println(b);
	}
	
	public void AtmStart() {
		while(true){
			System.out.println("Are you a New User or a Current User, please input 1-New User or 2-Current User");
			String d1 = input.nextLine();
			if(d1.equals("1") ) {
				creatNewAccount();
			    login();
			    break;
			}
		    else if(d1.equals("2") ) {
			    login();
			    break;
		   }else {
			   continue;
		   }
			
			
		}
		while(true) {
			System.out.println("What do you want to do 1-available Balace, 2-withDrawal, 3-deposit, 4-recentTransaction, 5-changePassword, 0-exit");
			String c = input.nextLine();
			if(c.equals("1") ) {
				availableBalance();
			}
			else if(c.equals("2") ) {
				withDrawal();
			}
			else if(c.equals("3") ) {
				deposit();
			}
			else if(c.equals("4") ) {
				recentTransactions();
			}
			else if(c.equals("5")) {
				changePassword();
			}
			else if(c.equals("0")) {
				System.out.println("Thank you");
				break;
			}	
		}

	}
	
	private void changePassword() {
		System.out.println("please enter your new password");
		String pw = input.nextLine();
		String an = currentUser.get(0).getBankAccountNumber();
		userData.get(an).setPassword(pw);
		System.out.println("change successful");	
	}

	public static void main(String[] args) {
		Atm a1 = new Atm(200000,10);
		User u1 = new User("qwer","123","xxxx","1234567890","222");
		u1.setPassword("000000");
		userData.put("222", u1);
		a1.AtmStart();
	}




		
	
	
	
	
	
	
	
	
	

	
	

}
