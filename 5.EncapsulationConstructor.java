//Concept of Encapsulation and Constructor

class Human {
	private int age;

	public Human() {
       System.out.println("Calling constructor");
       age=12;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age=age;
	}
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Human obj = new Human();
		System.out.println(obj.getAge());
		//obj.setAge(20);
		//System.out.println(obj.getAge());
	}
}
