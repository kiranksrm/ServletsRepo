public class ThreadTest {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child thread is running");
				}
			}
		});
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent thread is running");
		}
	}
}