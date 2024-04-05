package day_12_Functional_Interface_LamdaExpression;

public class UseCalculator {
	public static void main(String[] args) {
		
		
		Calculator c1 = (a,b) -> a+b;
		Calculator c2 = (a,b) -> {
			return b-a;
		};
		Calculator c3 = (a,b) -> a*b;
		Calculator c4 = (a,b) -> b/a;
		Calculator c5 = (a,b) -> b%a;
		
		System.out.println(c1.math(10, 20));
		System.out.println(c2.math(10, 20));
		System.out.println(c3.math(10, 20));
		System.out.println(c4.math(10, 20));
		System.out.println(c5.math(10, 20));
	}

}
