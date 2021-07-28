
public class Outer {
  private int data=20;
  
  private int add(int x, int y)
  {
	  return x+y;
  }
  
 	public static void main(String[] args) {
 		// TODO Auto-generated method stub
 		Outer o= new Outer();
 		o.add(10, 20);
 		
 		Outer.Inner i = o.new Inner();
 		Outer.Inner i1= new Outer().new Inner();
 		i.msg();
 		System.out.println(i.sub(20, 10));
 	}
 	
  class Inner
  {
	  void msg()
	  {
		  System.out.println("Data value is: "+data);
		  System.out.println(add(300, 400));
	  }
	  int sub(int i, int j)
	  {
		  return i-j;
	  }
  }
  
 

}//Outer class
