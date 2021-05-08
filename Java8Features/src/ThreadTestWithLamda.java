
public class ThreadTestWithLamda {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread is running");
			}
		});
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent thread is running");
		}
	}
}
