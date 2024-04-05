package day_12_Method_Reference;

public class UseMaxMin {
	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6};
		
		MyClass my = new MyClass();
		
		Max m = my::findMax;
		Max min = MyClass::findMin; //static method reference
		
		System.out.println(m.maths(a));
		System.out.println(min.maths(a));
		
	}

}
