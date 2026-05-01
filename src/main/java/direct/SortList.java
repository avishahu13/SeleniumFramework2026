package direct;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,1,3,4,5,6);
		
		Collections.sort(list);
		System.out.println(list); //Ascending
		
		Collections.sort(list, Collections.reverseOrder()); // Descending
		System.out.println(list);
		

	}

}
