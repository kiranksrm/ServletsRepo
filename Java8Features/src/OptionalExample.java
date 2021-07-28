import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] str= new String[10];
		//String s1= str[5].toLowerCase();
		
		
		 Optional<String> checkNull = Optional.ofNullable(str[5]);  
	        if(checkNull.isPresent()){  // check for value is present or not  
	            String lowercaseString = str[5].toLowerCase();  
	            System.out.print(lowercaseString);  
	        }else  
	            System.out.println("string value is not present");  
	}

}
