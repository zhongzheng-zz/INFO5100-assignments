package Dog;

import Pet.Pet;
import Boardable.Boardable;

public class Dog extends Pet implements Boardable{
	private String size;
	public int startMonth;
	public int startDay;
	public int startYear;
	public int endMonth;
	public int endDay;
	public int endYear;
	
	public void setBoardStart(int month, int day, int year) {
		if(month >= 1 && month <= 12 && day >= 1 && day <= 31 && year>= 1000 && year<=9999) {
			this.startMonth = month;
			this.startDay = day;
			this.startYear = year;		
		}else {
			System.out.println("the range of month is 1-12; the range of day is 1-31; the year must be a four digit number");
		}
		
	}
	
	public void setBoardEnd(int month, int day, int year) {
		if(month >= 1 && month <= 12 && day >= 1 && day <= 31 && year>= 1000 && year<=9999) {
			this.endMonth = month;
			this.endDay = day;
			this.endYear = year;
		}else {
			System.out.println("the range of month is 1-12; the range of day is 1-31; the year must be a four digit number");
		}
		
	}
	
	public boolean boarding(int month, int day, int year) {
		if(month >= 1 && month <= 12 && day >= 1 && day <= 31 && year>= 1000 && year<=9999) {
			if(year > startYear && year < endYear){
				System.out.println("true");
				return true;
			}else if(year == startYear) {
				if(month > startMonth) {
					System.out.println("true");
					return true;
				}else if(month == startMonth && day >=startDay) {
					System.out.println("true");
					return true;					
				}else {
					System.out.println("false");
					return false;
				}	
			}else if(year == endYear) {
				if(month < endMonth) {
					System.out.println("true");
					return true;	
				}else if(month == endMonth && day <= endDay) {
					System.out.println("true");
					return true;	
				}else {
					System.out.println("false");
					return false;
				}
			}
			else {
				System.out.println("false");
				return false;
			}
			
		}else {
			System.out.println("the range of month is 1-12; the range of day is 1-31; the year must be a four digit number");
		    return false;
		}
		
		
	}
	
	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}
	
	public String toString() {
		String s = "DOG: "+ "\n" + 
	               this.getPetName() +" owned by "+this.getOwnerName()+ "\n" +
	               "Color: " + this.getColor() + "\n" +
				   "Sex: " + getSex()+ "\n" +
		           "Size: " + this.size;
		System.out.println(s);
		return s;
	}
	
	
	public static void main(String[] args) {
		Dog d1 = new Dog("Spot","Susan","white","medium");
		d1.setSex(2);
		d1.setBoardStart(3, 5, 1999);
		d1.setBoardEnd(10, 20, 2019);
		d1.boarding(10, 1, 2019);
		System.out.println("-------------");
		d1.toString();
		
		
		
		
		
	}


}
