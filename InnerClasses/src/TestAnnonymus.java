
public class TestAnnonymus{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person1 p= new Person1() {

			@Override
			void eat() {
				System.out.println("Hello");
				
			}
			
		};
		
		p.eat();
		
		
		Test t = new Test() {

			@Override
			public void display(int i, int j) {
				System.out.println("i="+i+", j="+j);
				
			}

			
			
		};
		t.display(10,20);
		
	 // <Ref Variable> = ()->{};
		
		// Person1 p= ()-> {	System.out.println("Hello");	};
		//p.eat();
		
		//Test t1 = ()->{System.out.println("Display1");};
		//t1.display();
		
		Test t1 = ( i,  j)->{System.out.println("i="+i+", j="+j);};
		t1.display(30,40);
		
		
		
		//
		
	}

	
	
	

	

}
