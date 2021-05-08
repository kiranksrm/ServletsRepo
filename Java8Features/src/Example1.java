import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
//		for (Character c : vowels) {
//		                System.out.println(c);
//		}
		
		//List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');                             
		//vowels.forEach((Character c)->System.out.println(c));
		
		//vowels.forEach(c->System.out.println(c));
		vowels.forEach(System.out::println);
		
	}

}
