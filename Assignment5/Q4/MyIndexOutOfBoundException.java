package Q4;

import java.util.*;

public class MyIndexOutOfBoundException{
    int lowerBound = 0;
	int upperBound;
	int index;
    
	public int getUpperBound() {
		return upperBound;
	}
	
	public void setUpperBound(int a) {
		this.upperBound = a;
	}
	
	public void setIndex(int a) {
		this.index = a;
	}
	
	
	public String toString() {
	   String s = "Error Message: Index: " + this.index + ", but Lower bound: " 
	               + this.lowerBound + ", Upper bound: "+ this.upperBound;
	   System.out.println("Error Message: Index: " + this.index + ", but Lower bound: " 
               + this.lowerBound + ", Upper bound: "+ this.upperBound);
	   return s;
	}
	
	public static void main(String[] args) {
		MyIndexOutOfBoundException m = new MyIndexOutOfBoundException();
		int[] a = new int[10];
		Random r = new Random();
		int b = (int)(Math.random()*20);
		m.setUpperBound(a.length-1);
		m.setIndex(b);
		for(int i=0; i<a.length;i++) {
			a[i] = r.nextInt(10); 
		}
		try {
			System.out.println(a[b]);
		}
		catch(Exception e) {
			m.toString();
		}	
	}
}


