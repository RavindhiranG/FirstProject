package day_12_Method_Reference;

public class MyClass {
	public int findMax(int [] a) {
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i]>= max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static int findMin(int [] b) {
		int min = b[0];
		for(int x: b) {
			if(x < min) {
				min = x;
			}
		}
		return min;
	}

}
