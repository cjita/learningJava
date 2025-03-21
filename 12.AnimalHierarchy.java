/*Animal Hierarchy: Create a class hierarchy
with a base class Animal and derived classes like Dog and Cat, each with specific behaviors.

create base class Animal
create derived class Dog,Cat each with specific behaviors.

Animal
name -- construct calling
sound


Dog
fetch

Cat
purr
*/


class Animal {

private String name;

	public Animal(String name) {
	    this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void Sound() {
		System.out.println("Animal makes sound");
	}
	
	public void Eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}//constructor calling

	public void Sound() {
		System.out.println("bow wow");
	}
	
	public void fetch() {
		System.out.println(getName()+" is fetching");
	}
}

class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}//constructor calling

	public void Sound() {
		System.out.println("bow wow");
	}
	
	public void purr() {
		System.out.println(getName()+" is purring");
	}
}

public class Main
{
	public static void main(String[] args) {
		Dog dog = new Dog("husky");
		Cat cat = new Cat("persian cat");
        
        dog.Sound();
        dog.fetch();
        
        cat.Sound();
        cat.purr();
	}
}


