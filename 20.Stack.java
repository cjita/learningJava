
import java.util.Stack;

public class Main
{
	public static void main(String[] args) {
		Stack<String> animals=new Stack<>();
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Zebra");
		animals.push("Cat");
		System.out.println(animals);
		System.out.println(animals.peek());
		animals.pop();
		System.out.println(animals);
		System.out.println(animals.peek());
	}
}
