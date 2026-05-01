package direct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		
		list.add("ABC");
		list.add("DEF");
		list.add("ABC");
		list.add("EFG");
		list.add("FGH");
		
		List<String> ab = Arrays.asList("ABC","cdg","sdk","ABC","aaa");
		
		Set<String> set = new HashSet<>(list);
		
		Set<String> st = new HashSet<>(ab);
		
		System.out.println(st);
		
		System.out.println(set);
		
	}
}
