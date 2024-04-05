package day_12_Functional_Interface_LamdaExpression;

public class UseEmployee {
	public static void main(String[] args) {
		
		Employee emp = a -> {
			if(a <5) {
				return "Junior";
			}
			else  {
				return "senior";
			}
			
		
		};
		
		System.out.println(Employee.id(12));
		System.out.println(emp.experience(6));
		System.out.println(emp.appraisal(50000, 2));
		
	}

}
