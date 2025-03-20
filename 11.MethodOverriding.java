//method overriding

class Animal{
    public void animalSound(){
        System.out.println("Sound");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Bow wow");
    }
}

public class Main
{
	public static void main(String[] args) {
	    Animal anim = new Animal();
	    anim.animalSound();
	    
		Dog obj = new Dog();
		obj.animalSound();
	}
}
