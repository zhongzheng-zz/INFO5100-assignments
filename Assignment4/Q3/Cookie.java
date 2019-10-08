package Q3;

public class Cookie extends DessertItem {
	int number;
	int pricePerdozen;
	int cost;
	
	public Cookie(String name, int number, int pricePerdozen) {
		super(name);
		this.number = number;
		this.pricePerdozen = pricePerdozen;
	}
	
	public int getCost() {
		double a = Math.round(number * pricePerdozen);
	    double c = a /12;
		cost = (int)c;
	    return cost;
	}
	

}
