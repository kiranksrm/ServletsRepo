
public class LocalInner1 {
	
	private int i=30;
	public static final String AB="AB";
	
	void display()
	{
		
		class Local
		{
			public void msg()
			{
				System.out.println("Inside Local, "+i);
			}
		}
		
		Local l1 = new Local();
		l1.msg();
		
	}
	
	public static void main(String args[])
	{
		LocalInner1 l = new LocalInner1();
		System.out.println(l.i);
		l.display();
		
	}
	

}
