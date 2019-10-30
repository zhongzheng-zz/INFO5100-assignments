package Q4;

import java.util.*;

public class Unique {
	public  boolean uniqueOccurrences(int[] arr) {
		if(arr.length>1000 || arr.length<1) return false;
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for(int i : arr) {
			arr1.add(Integer.valueOf(i));
		}
		int len = arr.length;
		for(int j = 0; j < len; j++) {
			int count = 1;
			for(int c = j+1; c< len; c++) {
				if(arr1.get(j) == arr1.get(c)) {
					count = count+1;
					arr1.remove(c);
					len--;
					c--;	
				}
			}
			arr2.add(count);
			System.out.println(arr1.toString());
		}
		System.out.println(arr2.toString());
		for(int i = 0; i < arr2.size(); i++) {
			for(int j = i + 1; j< arr2.size(); j++) {
				if(arr2.get(i) == arr2.get(j)) {
					System.out.println("false");
					return false;
				}
			}
		}
		System.out.println("true");
		return true;
		
		
	}
	
	public static void main(String[] args) {
		Unique u = new Unique();
		int a1[]= {1,2,2,1,1,3};
		int a2[]= {-3,0,1,-3,1,1,1,-3,10,0};
		int a3[]= {1,2};
		u.uniqueOccurrences(a1);
		u.uniqueOccurrences(a2);
		u.uniqueOccurrences(a3);
	}

}
