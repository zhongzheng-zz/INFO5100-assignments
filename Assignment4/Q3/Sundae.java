package Q3;

public class Sundae extends IceCream{
	int topCost;
	String topName;
	String na1;
	
	public Sundae(String name, int cost, String name1, int cost1) {
		super(name,cost);
		this.topName = name1;
		this.topCost = cost1;
		na1 = topName + " Sundae with "+ name;
		if(na1.length() <= DessertShop.maxNamesize) {
			this.name = na1; 
		}else {
			this.name = na1.substring(0,DessertShop.maxNamesize) + "\n" + na1.substring(DessertShop.maxNamesize);
		}
	}
	
	public int getCost() {
		return cost + topCost;
	}
	
}
