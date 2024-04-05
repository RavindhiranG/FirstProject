package day_12_Static_keyword;

public class SportsCar implements Car{
	public String brand(String a) {
		return a;
		
	}
	public int price(int price, int tax) {
		return price+(price*tax/100);
		
	}

}
