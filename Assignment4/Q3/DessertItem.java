package Q3;

public abstract class DessertItem {
	protected String name;
	
	public DessertItem() {
		
	}
	
	public DessertItem(String name) {
		if(name.length() <= DessertShop.maxNamesize) {
			this.name = name; 
		}else {
			this.name = name.substring(0,DessertShop.maxNamesize);
		}
	}
	
	public final String getName() {
		return name;
	}
	
	public abstract int getCost();
		
}
