package Q4;

class CalculateSum extends Thread{
	int[] array;
	int start;
	int end;
	long sum;
	
	CalculateSum(int[] arr, int start, int end){
		this.array = arr;
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		for(int i = start; i < end; i++) {
			sum = sum + array[i];
		}
	}
	public long getSum() {
		return sum;
	}
}


public class SumValue {
	
	static void generateArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		
	}

	static long sum(int[] arr) {
		long sum = 0;
		CalculateSum t1 = new CalculateSum(arr,0,1000000);
		CalculateSum t2 = new CalculateSum(arr,1000000,2000000);
		CalculateSum t3 = new CalculateSum(arr,2000000,3000000);
		CalculateSum t4 = new CalculateSum(arr,3000000,4000000);
		t1.run();
		t2.run();
		t3.run();
		t4.run();
		sum = t1.getSum() + t2.getSum() + t3.getSum() + t4.getSum();
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[4000000];
		generateArray(arr);
		long sum = sum(arr);
		System.out.println("Sum: " + sum);
		}
}
