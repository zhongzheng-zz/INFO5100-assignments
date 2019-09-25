package Assignment2;



/**
 * Submit it on or before 22nd September 2019 , 12:00 pm
 */
public class Assignment2 {
    /*
        This method should return the sum of salaries of employees having salary greater than 5000
        Note: Employee array is passed, not employee
     */
    public double salaryGreaterThanFiveThousand(Employee[] employees) {
    	double sum = 0.0;
        int i;
        for(i = 0;i < employees.length;i++) {
        	if(employees[i].getSalary()>5000) {
        		sum = sum + employees[i].getSalary();
        	}
        }
        return sum;
    }

    
    /*
        This method should print either "Fizz", "Buzz" or "FizzBuzz"
        "Fizz" - if id of employee is divisible by 3
        "Buzz" - if id of employee is divisible by 5
        "FizzBuzz" - if id of employee is divisible by both 3 and 5
     */
    public void fizzBuzz(Employee employee) {
    	if(employee.getId() % 3 == 0 && employee.getId() % 5 == 0) {
            System.out.println("FizzBuzz");
        }else if(employee.getId() % 5 == 0) {
            System.out.println("Buzz");  
        }else if(employee.getId() % 3 == 0 ) {
            System.out.println("Fizz");
        } 
    }

    
    /*
        This method should calculate tax for an employee in dollars
        If salary of employee is less than or equal to 2500, tax should be 10%
        If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25%
        If salary of employee is greater than 5000, tax should be 35%
    */
    public double calculateTax(Employee employee) {
        double tax = 0.0;
    	if(employee.getSalary() <= 2500) {
            tax = employee.getSalary()*0.10;
        }else if(employee.getSalary() >2500 && employee.getSalary() < 5000) {
        	tax = employee.getSalary()*0.25;
        }else if(employee.getSalary() > 5000) {
        	tax = employee.getSalary()*0.35;
        }
        return tax;
    }
    
    /*
        We are given two employee objects.
        Implement this method to swap salaries of employees
    */
    public void swap(Employee firstEmployee, Employee secondEmployee) {
         double a = firstEmployee.getSalary();
         firstEmployee.setSalary(secondEmployee.getSalary());
         secondEmployee.setSalary(a);
         System.out.println(firstEmployee.getSalary());
         System.out.println(secondEmployee.getSalary());
    }

    
    /*
        Return number of employees whose age is greater than 50
        Note: Employee array is passed, not employee
     */
    public int employeesAgeGreaterThan50(Employee[] employees) {
        int number = 0;
        for(int q = 0; q < employees.length; q++) {
        	if(employees[q].getAge()>50) {
        		number++;
        	}
        }
        return number;
    }

    
    /*
        Implement this method to reverse firstName of employee.
        Ex. Before: employee.getFirstName() -> "John"
        After : employee.getFirstName() -> "nhoJ"
     */
    public void reverseFirstName(Employee employee) {
       System.out.println("employee.getFirstName() ->" + employee.getFirstName());
       String nm;
       char[] ch1 = employee.getFirstName().toCharArray();
       char[] ch2 =new char[ch1.length];
       int a=0;
       for(int b=ch1.length-1;b>=0; b--) {
    		ch2[a]=ch1[b];
    		a++;
    		  }
       nm = String.valueOf(ch2);
       employee.setFirstName(nm);
       System.out.println("employee.getFirstName() ->" + employee.getFirstName());
    }

    
    /*
        Print "true" if employee's first name contain one or more digits
        Print "false" if employee's first name doesn't contain any digit
        Ex: employee.getFirstName() -> "ha8l" == true
        employee.getFirstName() -> "hail" == false
     */
    public void isContainDigit(Employee employee) {
    	String fn = employee.getFirstName();
    	for(int i=0; i<fn.length(); i++) {
    		if(Character.isDigit(fn.charAt(i))) {
    			System.out.println("employee.getFirstName() -> "+ fn +" == " + "true");
    		    return;
    		}
    		else if(i == fn.length()) {
    			return;
    		}
    	}
    	System.out.println("employee.getFirstName() -> "+ fn +" == " + "false");
    }

    
     /*
        Write a method to raise an employee's salary to three times of his/her original salary.
        Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
        DO NOT change the input in this method.
        Try to add a new method in Employee class: public void raiseSalary(double byPercent) 
        Call this new method.
     */
    public void tripleSalary(Employee employee) {
        System.out.println("Salary is :" + employee.getSalary());
        double p = employee.getbyPercent();
        employee.raiseSalary(p);
        System.out.println("Salary is :" + employee.getSalary());
    }
    
    
    //Additional question for extra credit
    /*
        Implement this method to convert String[] to employees array.
        Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
        This String array of length 2 contains 2 employees in form of string, where
        id = 1
        firstName=John
        age=24
        salary=7500
        convert each string to employee object.
        Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     */
    public Employee[] createEmployees(String[] employeesStr) {
    	Employee[] employees = new Employee[employeesStr.length];       
    	return employees;
    }
    
    
    public static void main(String args[]) {
    	Assignment2 assignment2 = new Assignment2();
    	Employee employee[] =  new Employee[5];
    	employee[0] = new Employee(1, "J0hn", 24,7500);
    	employee[1] = new Employee(2, "Hail", 70, 300);
    	employee[2] = new Employee(3, "Peter", 20, 3000);
    	employee[3] = new Employee(5, "Alliesha", 90, 9000.4);
    	employee[4] = new Employee(30, "Allison", 60, 8000.8);
    	
    	double result0 = assignment2.salaryGreaterThanFiveThousand(employee);
    	System.out.println(result0);
    	
    	assignment2.fizzBuzz(employee[2]);
    	assignment2.fizzBuzz(employee[3]);
    	assignment2.fizzBuzz(employee[4]);
       	
    	double result1 = assignment2.calculateTax(employee[4]);
        System.out.println("the tax is"+":"+ result1); 
    	
        assignment2.swap(employee[0],employee[1]);
        
        int result2 = assignment2.employeesAgeGreaterThan50(employee);
    	System.out.println(result2);
    	
    	assignment2.reverseFirstName(employee[1]);
    	assignment2.reverseFirstName(employee[4]);
    	
    	assignment2.isContainDigit(employee[0]);
    	assignment2.isContainDigit(employee[1]);
    	
    	assignment2.tripleSalary(employee[1]); 
    }
    
    
    
    
}

