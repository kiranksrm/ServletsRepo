/**
 * 
 */

/**
 * @author vinod
 *
 */
public class ThreadEx {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World");
				
			}
		};
		
		r.run();
		
		
	}

}
