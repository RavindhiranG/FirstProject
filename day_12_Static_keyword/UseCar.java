package day_12_Static_keyword;

public class UseCar {
	public static void main(String[] args) {
		SportsCar car = new SportsCar();
		System.out.println(car.brand("Audi"));
		System.out.println(car.price(10000, 20)); // for normal methods in interfaces, object has to be created and called
		System.out.println(Car.fuelType("Diesel"));  // can be called the static method using interface class alone
		System.out.println(Car.model("2005"));
		
	}

}
