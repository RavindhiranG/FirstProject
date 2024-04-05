package day_12_Static_Default_keyword;

public class UseFurniture {
	public static void main(String[] args) {
		Table x = new Table();
		System.out.println(Furniture.brand("OFC"));
		System.out.println(x.category("table"));
		System.out.println(x.available(true));
		
		Furniture y = new Table();
		System.out.println(y.available(true));
		
		


		
	
	}

}
