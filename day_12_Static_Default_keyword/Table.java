package day_12_Static_Default_keyword;

public class Table implements Furniture{
	
	//implementing unimplemented method
	public String category(String b){
		return b;
	}

	
	//default method overriding
	
//	public  String  available(boolean a) {
//		if(a == true) {
//			return "Available in stock and will not able to purchase"; 
//		}
//		else {
//			return "Stock is broken and can be repaired and allowed to purchase";
//			}
//	}
	

}
