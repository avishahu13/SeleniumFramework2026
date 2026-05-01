package direct;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Elementcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("abcd","chrome","abcd","firefox","chrome","abcd");
		
		Map<String,Integer> map = new HashMap<>();
		
		for(String b: list) {
			
			map.put(b, map.getOrDefault(b, 0)+1);
		}
		
		System.out.println(map);
	}

}
