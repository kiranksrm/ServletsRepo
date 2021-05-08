
public class SumOf2Numbers {

	interface A
	{
		int add(int i, int j);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A s=(i,j)->{return (i+j);};
		System.out.println(s.add(10, 20));
	}

}
