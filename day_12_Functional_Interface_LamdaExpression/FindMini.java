package day_12_Functional_Interface_LamdaExpression;

public class FindMini {
	public static void main(String[] args) {
		String [] names = {"ravindhiran", "kamal", "karthick", "arrahman"};
		
		
		
		findMinimum findM = a -> {
			String min = a[0];
			for(int i = 0; i < a.length; i++) {
				if(a[i].length() < min.length()) {
					min = a[i];
					
				}
			}
			return min;
			
		};
		System.out.println(findM.findMinLength(names));
		
	}

}

interface findMinimum {
	public String findMinLength(String [] a);
}
