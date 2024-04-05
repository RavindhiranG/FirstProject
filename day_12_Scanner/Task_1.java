package day_12_Scanner;

import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
//		Scanner x = new Scanner(System.in);
//		System.out.println("Type your name: ");
//		
//		String name = x.nextLine();
//		System.out.println("Hi "+name);
//		
//		
//		Scanner y = new Scanner(System.in);
//		
//		
//		System.out.println("Type your age: ");
//		
//		int age = y.nextInt();
//		
//		Scanner z = new Scanner(System.in);
//		System.out.println("Are you bachelor ? ");
//		
//		boolean bachelor = z.nextBoolean();
//		System.out.println("HI "+ name+" your age is "+age+" and are you bachelor ? "+bachelor);
		
		int n = 0;
		Scanner x = new Scanner(System.in);
		System.out.println("How many integers you want inside the array ?");
		
		n = x.nextInt();
		
		int [] numbers = new int [n];
		
		System.out.println("Enter all the "+n+" number for the array ");
		
		Scanner y = new Scanner(System.in);
		
		for(int i = 0; i < n; i++) {
			numbers[i] = y.nextInt();
		}
		
		Scanner z = new Scanner(System.in);
		System.out.println("Would you like to read the numbers yes or no ?");
		
		String dum = z.nextLine();
		
		if(dum.equalsIgnoreCase("yes")) {
			for(int i = 0; i < numbers.length; i++ ) {
				System.out.println(numbers[i]);
			}
		}
		

	}

}
