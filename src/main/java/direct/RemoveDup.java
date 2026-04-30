package direct;

import java.util.*;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new LinkedList<>();
		
		list = Arrays.asList(1,2,1,2,3,4,3);
		Set<Integer> set = new HashSet<>();
		Set<Integer> dup = new LinkedHashSet<>();
		
		for(int a : list) {
			if(!set.add(a)) {
				dup.add(a);
			}
			
		}
		System.out.println(dup);
		System.out.println(set);
		
		
		Iterator it = dup.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
