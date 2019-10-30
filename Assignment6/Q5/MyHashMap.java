package Q5;

public class MyHashMap {
	int[] mhm = new int[1000001];
	
	public MyHashMap() {
		for(int i = 0; i< mhm.length; i++) {
			mhm[i] = -1;
		}
	}
		
	public void put(int key, int value) {
			mhm[key] = value;
	}
	
	public int get(int key) {
		if(mhm[key] != -1 ) {
			System.out.println(mhm[key]);
			return mhm[key];
		}
		else {
			System.out.println(-1);
			return -1;
		}
		
	}
	
	public void remove(int key) {
		mhm[key] = -1;
		
	}
	
	public static void main(String[] args) {
		MyHashMap hashMap = new MyHashMap();
		hashMap.put(1, 1);
		hashMap.put(2, 2);
		hashMap.get(1);
		hashMap.get(3);
		hashMap.put(2, 1);
		hashMap.get(2);
		hashMap.remove(2);
		hashMap.get(2);
		hashMap.put(10, 11);
	}
	

}
