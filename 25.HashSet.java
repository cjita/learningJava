//the set is stored in random order because it creates unique hash set 

import java.util.Set;
import java.util.HashSet;

public class Main
{
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		
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
