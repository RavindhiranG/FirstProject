package day_12_Default_keyword;

public class UseMobile {
	
	public static void main(String[] args) {
		
		//with overriden default method in Mobile class
		
		Mobile mob = new Mobile();
		System.out.println(mob.oneOff(true));
		System.out.println(mob.resaleValue(100));
		
		
		
		//without overriding of default method in Mobile class
		
		Electronics mob1 = new Mobile();
		System.out.println(mob1.resaleValue(10));
		System.out.println(mob1.oneOff(true));
		
		
		System.out.println("hi");
		
		
		
	}

}
