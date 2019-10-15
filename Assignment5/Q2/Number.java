package Q2;
import java.util.*;

public class Number {
	int quo;
	
	public void count(int i,int j) {
		quo = i / j ;
        System.out.println(quo);	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Number N = new Number();
		System.out.println("please enter the first number: ");
		try {
			int n1 = scanner.nextInt();
		    System.out.println("please enter the second number: ");
		    int n2 = scanner.nextInt();
		    N.count(n1, n2);
		}
	    catch(InputMismatchException e) {
	    	System.out.println("please input an intger ");
		}
		catch(ArithmeticException e) {
			System.out.println("0 can't be denominator");
		}
		catch(Exception e) {
			System.out.println("you can't do that");
		}
		scanner.close();
	}
}
