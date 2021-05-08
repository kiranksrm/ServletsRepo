


class TestAnnonymousInner1 {
	
	public final String HELLO= "Hello";
	
	
	interface Eatable {
		void eat();
	}
	public static void main(String args[]) {
		Eatable e = new Eatable() {
			public void eat() {
				System.out.println("nice fruits");
			}
		};
		
		
		e.eat();
	}
}