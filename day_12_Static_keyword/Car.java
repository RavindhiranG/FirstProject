package day_12_Static_keyword;

public interface Car {
	public String brand(String a);
	public int price(int price, int tax);
	public static String fuelType(String b) {
		return b;
	}
	public static String model(String c) {
		return c;
	}

}
