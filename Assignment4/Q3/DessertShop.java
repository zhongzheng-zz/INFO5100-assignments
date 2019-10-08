package Q3;

public class DessertShop {
	static double tax = 0.065;
	static String storeName = "M & M Dessert Shop" ;
	static int maxNamesize = 22;

	
	public static String cent2dollarsAndCents(int i) {
		double a = (double) i/100;
	    String c = String.format("%.2f",a);
		return c;
	} 
	
}
