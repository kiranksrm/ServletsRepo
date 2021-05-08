
public class ThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(){
			public void run()
			{
				System.out.println("Hello World");
			}
		};
		t.run();
		
		
	}

}
