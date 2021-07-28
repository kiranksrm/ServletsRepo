import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"HP",25000f));
		list.add(new Product(2, "Lenovo",30000f));
		list.add(new Product(3, "Dell",40000f));
		
		for(Product p: list)
		{
			
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
		
		//Sort based on Name
		System.out.println("Sorting based on name");
		
		
//		Collections.sort(list, new Comparator<T>() {
//			return p1.name.compareTo(p2.name)
//		});
		
		Collections.sort(list, (p1,p2) -> {return p1.name.compareTo(p2.name); }   );
		for(Product p: list)
		{
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
	}

}
