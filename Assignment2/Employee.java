package Assignment2;

public class Employee {
    private int id;
    private String firstName;
    private int age;
    private double salary;
    private double byPercent = 3;
 
    
    Employee(int id, String firstName, int age, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void raiseSalary(double byPercent) {
    	salary = salary * byPercent;
    }
    public double getbyPercent() {
    	return byPercent;
    }
}


