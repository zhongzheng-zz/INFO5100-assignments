package Q3;

public class Checkout {
	DessertItem[] DI;
	int ni;
	
	public Checkout() {
		DI = new DessertItem[50];   
	}
	   
	public int numberOfItems() {
		return ni;
	}
	
	public void enterItem(DessertItem item) {
		DI[ni] = item;
		ni++;
	}
	
	public void clear() {
		ni = 0;
	}
	
	public  int totalCost() {
		int tc = 0;
		for(int b = 0; b < ni; b++) {
			tc = tc + DI[b].getCost();
		}
		return tc;
	}
	public  int totalTax() {
		int tt = 0;
		int tax = 0;
		for(int b = 0; b < ni;b++) {
			tax = (int)Math.round((DI[b].getCost()* DessertShop.tax));
			tt = tt + tax;
		}
		return tt;
	}
	
	public String toString() {
		System.out.println("       " + DessertShop.storeName + "      ");
		System.out.println("    ----------------------------       ");
        String s = "\n";
        for(int i =0; i < ni; i++) {
        	if(DI[i] instanceof Candy) {
        		s = s + ((Candy)DI[i]).weight + " lbs. @ " + DessertShop.cent2dollarsAndCents(((Candy)DI[i]).pricePerpound) +" /lb. "+ "\n";
        	}
        	if(DI[i] instanceof Cookie) {
        		s = s + ((Cookie)DI[i]).number + " @ " + DessertShop.cent2dollarsAndCents(((Cookie)DI[i]).pricePerdozen) +" /dz. "+ "\n";
        	}
        	String s1 = DI[i].getName(); 
        	String s2 = "              " +DessertShop.cent2dollarsAndCents(DI[i].getCost());
        	s = s + s1 +s2 +"\n";
        }
        s = s +"Tax                              " + DessertShop.cent2dollarsAndCents(totalTax()) + "\n";
        s = s + "Total Cost                      " + DessertShop.cent2dollarsAndCents((totalCost())+(totalTax()));
	    return s;
	}	
	
 
}
