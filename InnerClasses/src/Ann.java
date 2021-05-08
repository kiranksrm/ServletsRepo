
public class Ann{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person() {
			void eat() {
				System.out.println("EAT..");
			}
		};
		p.eat();

	}
	
}
abstract class Person
{
	abstract void eat();
}