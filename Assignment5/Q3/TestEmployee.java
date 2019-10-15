package Q3;

public class TestEmployee {

	public static void main(String[] args) {
		Contractor c1 = new Contractor("abc",3,15); 
        Contractor c2 = new Contractor("TATE",20,8);
        c1.calculateSalary();
        c2.calculateSalary();
        
        FullTime f1 = new FullTime("santitas", 90);
        FullTime f2 = new FullTime("tortillas", 100);
        f1.calculateSalary();
        f2.calculateSalary();
	}

}
