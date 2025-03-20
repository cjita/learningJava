//interface in java

interface A{
        //int and string are by default static and final
        int age=5;
        String area="8";
        
        //by default method is public and abstract
        void drive();
        void fly();
        
        
    }
    
    
class B implements A{
    public void fly(){
        System.out.println("flying");
    }
    
    public void drive(){
        System.out.println("driving");
    }
    
}
    

public class Main
{
    
    
    
	public static void main(String[] args) {
	    System.out.println("terry");
	    A obj = new B();
	    obj.fly();
	    obj.drive();
	    //A.age is static so no object creation required
	    System.out.println(A.age);

	}
}
