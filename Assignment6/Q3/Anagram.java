package Q3;

public class Anagram {

	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			System.out.println("false"); 
			return false;	
		}
		
		int[] l = new int[26];
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		
		for(int i = 0; i < s.length(); i++) {
			l[c1[i]-'a']++;
			l[c2[i]-'a']--;
		}
		for(int count : l) {
			if(count !=0) {
				System.out.println("false");
				return false;
			}
		}
		System.out.println("true");
		return true;
	}

	public static void main(String[] args) {
		Anagram a1 = new Anagram();
		a1.isAnagram("anagram", "nagaram");
		a1.isAnagram("rat", "car");

	}

}
