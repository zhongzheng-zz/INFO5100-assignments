package Q3;

public class FullTime extends Employee {
	private final int workingHours = 8;
	
	public FullTime(String name, int paymentPerHour) {
		super(name,paymentPerHour);
	}
	
	
	public int calculateSalary() {
		int salary = getPaymentPerHour() * this.workingHours;
		System.out.println(salary);
		return salary;
	}

}
