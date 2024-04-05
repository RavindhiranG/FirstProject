package day_12_Functional_Interface_LamdaExpression;

public interface Employee {
	public String experience(int age);
	public static int id(int id) {
		return id;
	}
	public default int appraisal(int salary, int percent) {
		return salary*percent/100;
	}

}
