//for linkedlist wit is similar to arraylist for list interface


import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		List<Integer> number = new LinkedList<>();
		number.add(5);
		number.add(8);
		number.add(15);
		System.out.println(number);
		
		// add number at end
		number.add(30);
		System.out.println(number);
		
		//size of array 
		System.out.println(number.size());
		
		//print second index 
		System.out.println(number.get(2));
		
		//update second index 
		number.set(2,60);
		System.out.println(number.get(2));
		System.out.println(number);
		
		//remove second index 
		number.remove(2);
		System.out.println(number);
		
		//remove value 8 
		number.remove(Integer.valueOf(8));
		System.out.println(number);
		
		//contains value 30 
		number.remove(Integer.valueOf(8));
		System.out.println(number.contains(30));
		
		//creating newList
		List<Integer> newList = new LinkedList<>();
		newList.add(150);
		newList.add(160);
		System.out.println(newList);
		newList.addAll(number);
		System.out.println(newList);
		
		//clearing 
		newList.clear();
		System.out.println(newList);
		
		//iterating over ArrayList
		for(int i=0;i<number.size();i++){
		    System.out.println("the element is "+ number.get(i));
		}
		
		//iterating over ArrayList
		for(int element:number){
		    System.out.println("the element is "+ element);
		}
		
		Iterator<Integer> it = number.iterator();
		//iterating over ArrayList
		while(it.hasNext()){
		    System.out.println("the element is "+ it.next());
		}
	}
}
