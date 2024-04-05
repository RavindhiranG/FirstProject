package day_12_OptionalClass;

import java.util.Optional;

public class Class1 {
	public static void main(String[] args) {
		String a = "ravi";
		Optional<String> op = Optional.ofNullable(a);
		System.out.println(op);
		
		if(op.isPresent()) {
			System.out.println(a.toUpperCase());
		}
		else {
			System.out.println("Its null");
		}
		
		if(op.isEmpty()) {
			System.out.println("empty");
		}
		else {
			System.out.println("Its present");
		}
		
		System.out.println(op.orElse("It is null"));
		
	}

}
