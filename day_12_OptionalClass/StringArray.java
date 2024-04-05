package day_12_OptionalClass;

import java.util.Optional;

public class StringArray {
	public static void main(String[] args) {
		String [] a = {"raja", null, "KANNAN", "xyz", null};
		
		for(String x: a) {
			Optional<String> op = Optional.ofNullable(x);
			
			if(op.isPresent()) {
				System.out.println(x+" "+x.toUpperCase());
			}
			else {
				System.out.println(x+" is null");
			}
		}
		
		System.out.println("-----------------------------------");
		
		for(String x: a) {
			Optional<String> op = Optional.ofNullable(x);
			
			if(op.isEmpty()) {
				System.out.println(x+" is null");
				
			}
			else {
				System.out.println(x+" "+x.toLowerCase());
			}
		}
		
		System.out.println("-----------------------------------");
		
		for(String x: a) {
			Optional<String> op = Optional.ofNullable(x);
			System.out.println(op.orElse(x+" is null"));
			
		}
	}

}
