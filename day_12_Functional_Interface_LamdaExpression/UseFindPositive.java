package day_12_Functional_Interface_LamdaExpression;

public class UseFindPositive {
	public static void main(String[] args) {
		
		int [] a = {0,1,2,-4,-5,6,7};
		
		FindPositive p1 = b -> { for(int x: b) {
			if(x >= 0) {
				System.out.println( x+ " is positive");
			}
			else {
				System.out.println(x +" is negative");
			}
		}
			
		};
		
		p1.findP(a);
		
	}

}
