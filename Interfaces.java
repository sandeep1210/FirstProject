public class Inheritance {
 int a;
 int b;
 public void addition(int x,int y)
 	{
	 
	 this.a= x;
	 this.b= y;	
	 System.out.println(" The addition of a & b is:"+(x+y));
	 
 	}
}
class subclass extends Inheritance{
	
 public void subtraction()
 	{
	 System.out.println(" The subtraction of a & b is:"+(a-b));
 	}
 public void multiplication()
 	{
	 System.out.println(" The Multiplication of a & b is:"+(a*b));
 	}
 public void modulus()
	{
	 System.out.println(" The modulus of a & b is:"+(a%b));
	}
 	
}
