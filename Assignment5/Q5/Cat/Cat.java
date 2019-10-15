package Cat;

import Pet.Pet;
import Boardable.Boardable;

public class Cat extends Pet implements Boardable{
	private String hairLength; 
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
	public Cat(String name, String ownerName, String color, String hairLength){
		super(name, ownerName, color);
		this.hairLength = hairLength;
	}
	
	public String getHairLength() {
		return hairLength;
	}
	
	public String toString() {
		String s = "CAT: "+ "\n" + 
	               this.getPetName() +" owned by "+this.getOwnerName()+ "\n" +
	               "Color: " + this.getColor() + "\n" +
				   "Sex: " + getSex()+ "\n" +
		           "Hair: " + this.hairLength;
		System.out.println(s);
		return s;
		
	}
	
	public static void main (String[] args) {
		Cat c1 = new Cat("Tom", "Bob", "black", "short");
		c1.setSex(2);
		c1.setBoardStart(9, 10, 2000);
		c1.setBoardEnd(9, 22, 2020);
		c1.boarding(9, 12, 2000);
		System.out.println("-----------");
		c1.toString();
	}

}
