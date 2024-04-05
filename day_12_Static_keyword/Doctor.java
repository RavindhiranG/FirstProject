package day_12_Static_keyword;

public class Doctor {
	public static void main(String[] args) {
		
		Doctors d = new Doctors();
		System.out.println("Name: "+d.name("Dr.Nadnhini"));
		System.out.println("Type: "+d.type("General Doctor"));
		System.out.println("Age: "+d.age(32));
		System.out.println("Gender: "+ d.gender("Female"));
		System.out.println("Is available: "+d.isAvaialble(true));
		System.out.println("Fees per hour: "+DoctorInterface.fees(13, 200));
		
		
		
		
	}
}

interface DoctorInterface {
	public String name(String a);
	public String type(String b);
	public int age(int c);
	public static String fees(int time, int fee) {
		if(time >= 9 && time <= 18 ) {
			int total =  time*fee;
			return "9AM to 6PM fees is "+total+" per hour";
		}
		else {
			int total = time*(fee*2);
			return "6AM to 9AM & 6PM to 10PM is "+total+" per hour"; 
		}
	}
	public boolean isAvaialble(boolean d);


}

class Doctors implements DoctorInterface {
	
	public String name(String a) {
		return a;
		
	}
	public String type(String b) {
		return b;
		
	}
	public int age(int c) {
		return c;
		
	}
	public boolean isAvaialble(boolean d) {
		return d;
		
	}
	public String gender(String a) {
		return a;
		
	}
	

	
}

