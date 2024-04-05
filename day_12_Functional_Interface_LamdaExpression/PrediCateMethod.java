package day_12_Functional_Interface_LamdaExpression;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PrediCateMethod {
	public static void main(String[] args) {
		int[] b = { 2, 3, 4, 5, 6, 7, 8, 9 };

		// Define a Predicate to check if a number is even
		Predicate<Integer> isEven = n -> n % 2 == 0;

		// Use the Predicate to filter even numbers from the array
		int[] evenNumbers = filterArray(b, isEven);

		// Print the even numbers
		System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
		
		
		Predicate<Integer> isEvenPredicate = n -> n % 2 == 0; // Lambda expression
        int number = 10;
        boolean isEvens = isEvenPredicate.test(number);
        System.out.println(number + " is even? " + isEvens);
	}

	public static int[] filterArray ( int[] array, Predicate<Integer> predicate ) {
		return Arrays.stream(array).filter(predicate::test).toArray();
	}

}
