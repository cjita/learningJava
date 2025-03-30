//the set is stored in arranged/ascending order 

import java.util.Set;
import java.util.TreeSet;

public class Main
{
	public static void main(String[] args) {
		Set<Integer> set=new TreeSet<>();
		
		set.add(25);
		set.add(85);
		set.add(32);
		set.add(48);
		System.out.println(set);
		set.remove(32);
		System.out.println(set);
		System.out.println(set.contains(25));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
        System.out.println(set);

	}
}
