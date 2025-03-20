//abstraction in java

abstract class Car{
        public void playMusic(){
            System.out.println("playing music");
        }
        
        public abstract void drive();
        public abstract void fly();
        
        
    }
    
abstract class WagonR extends Car{
    public  void drive(){
        System.out.println("driving car");
    }
    
}

class UpdatedWagonR extends WagonR{
    public  void fly(){
        System.out.println("flying car");
    }
}

public class Main
{
    
    
    
	public static void main(String[] args) {
	    System.out.println("terry");
	    
	    Car c = new UpdatedWagonR();
	    c.playMusic();
	    c.drive();
	    c.fly();
	}
}
