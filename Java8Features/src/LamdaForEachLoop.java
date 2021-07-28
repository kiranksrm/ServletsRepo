import java.util.ArrayList;
import java.util.List;

public class LamdaForEachLoop {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Core Java");
		list.add("J2EE");
		list.add("Java8");
		
		for(String s: list)
		{
			System.out.println(s);
		}
		
		list.forEach(s1->{System.out.println("----"+s1);}     );
		
		
	}

}
