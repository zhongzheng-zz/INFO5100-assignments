package Q5;

import java.util.Arrays;

public class Extra {
	public void IorD(String[] string) {
		int N = string.length;
		int[] m = new int[N+1];
        int j = 0;
		for(int i = 0; i < string.length; i++) {
			if(i == string.length-1 && string[i] == "I") {
				m[i] = j;
				m[i+1] = N;
			}
			else if(i == string.length-1 && string[i] == "D") {
				m[i] = N;
				m[i+1] = j;
			}
			else if(string[i] == "I") {
				m[i] = j;
				j++;
			}
			else if(string[i] == "D") {
			    m[i] = N;
			    N--;	
			} 
			
		}
        System.out.println(Arrays.toString(m));	 
	 }
	 
	public static void main(String[] args) {
		Extra ex = new Extra();
		String[] s1 = new String[] {"I","D","I","D"};
		String[] s2 = new String[] {"I","I","I"};
		String[] s3 = new String[] {"D","D","I"};
		ex.IorD(s1);
		ex.IorD(s2);
		ex.IorD(s3);
	}

}
