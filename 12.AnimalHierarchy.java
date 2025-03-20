//Animal Hierarchy: Create a class hierarchy with a base class Animal and derived classes like Dog and Cat, each with specific behaviors.

// Base class Animal
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Derived class Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the Animal class constructor
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching a ball.");
    }
}

// Derived class Cat
class Cat extends Animal {
    public Cat(String name) {
        super(name); // Call the Animal class constructor
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void purr() {
        System.out.println(getName() + " is purring.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        Dog myDog = new Dog("Buddy");
        Cat myCat = new Cat("Whiskers");

        genericAnimal.makeSound();
        genericAnimal.eat();

        myDog.makeSound();
        myDog.eat();
        myDog.fetch();

        myCat.makeSound();
        myCat.eat();
        myCat.purr();

        // Polymorphism example
        Animal animal1 = new Dog("Rover");
        Animal animal2 = new Cat("Mittens");

        animal1.makeSound(); // Calls Dog's makeSound()
        animal2.makeSound(); // Calls Cat's makeSound()
    }
}
