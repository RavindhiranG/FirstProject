package day_12_Static_Default_keyword;

public interface Furniture {
	
	//static method
	public static String brand(String a) {
		return a;
	}
	
	//unimplemented method
	
	public String category(String b);
	
	//default method
	
	public default String available(boolean a) {
		if(a == true) {
			return "Available in stock and will be to purchase"; 
		}
		else {
			return "Stock is not available";
			
		}
	}

}
