package Q3;

public class Candy extends DessertItem{
	double weight;
	int pricePerpound;
	int cost;
	
	public Candy(String name, double weight, int pricePerpound) {
		super(name);
		this.weight = weight;
		this.pricePerpound = pricePerpound;
	}
		
	public int getCost() {
		double a = Math.round(weight * pricePerpound);
		cost = (int)a;
		return cost;
	}
	
}
