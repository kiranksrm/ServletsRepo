
public class HelloWorld  {

	interface HelloService
	{
		String hello(String firstName, String lastName);
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloService hs= (String firstName, String lastName)->{return "hello,"+firstName+lastName;};
		System.out.println(hs.hello("Kiran","reddy"));
	}

}

