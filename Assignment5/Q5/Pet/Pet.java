package Pet;

public class Pet {
	private String petName;
	private String ownerName;
	private String color;
	protected int sexid;
	
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	public static final int SPAYED = 2;
	public static final int NEUTERED = 3;
	
	public Pet(String name, String ownerName, String color){
		this.petName = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSex(int sexid) {
		this.sexid = sexid;
	}
	
	public String getSex() {
		if(sexid == 0) {
		   return "MALE";	
		}
		else if(sexid == 1) {
			return "FEMALE";
			
		}
		else if(sexid == 2) {
			return "SPAYED";
			
		}
		else if(sexid == 3) {
			return "NEUTERED";
		}
		else {
			return "you can only input 0/1/2/3, please try again";
		}
	}
	
	public String toString() {
		String s = this.petName + " owned by " + this.ownerName + "\n" +
				   "Color: " + this.color + "\n" +
				   "Sex: " + getSex();
		System.out.println(s);
		return s;
	}
	
	
	public static void main (String[] args) {
		Pet p1 = new Pet("Spot", "Mary", "Black and White");
		p1.toString();
	}

}
