package day_12_Functional_Interface_LamdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindVowels {
	public static void main(String[] args) {
		List <String> names = Arrays.asList("ravindhiran", "john", "xyz", "ytzh");
		
//		List <String> f =  names.stream()
//				.filter( x -> (x.contains("a") || x.contains("e")|| x.contains("i")|| x.contains("o")|| x.contains("u")))
//						.collect( Collectors.toList() ); 
//		
//		Findvow e = b -> {
//			return b;
//		};
		
		//System.out.println(e.findVowelWords(f));
		
		Findvow vowelWords = x -> {
			List <String>  vowelList=  x.stream()
				.filter( xy -> (xy.contains("a") || xy.contains("e")|| xy.contains("i")|| xy.contains("o")|| xy.contains("u")))
				.collect( Collectors.toList() ); 
			return vowelList;
		}; 
		
		System.out.println(vowelWords.findVowelWords(names));
		
		
		
	}
	

}

interface Findvow {
	public List<String> findVowelWords(List<String> a);
}
