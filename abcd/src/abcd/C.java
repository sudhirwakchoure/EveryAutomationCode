package abcd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class C {

	public static void main(String[] args) {
		
		String name = "we like test automation";
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		
		char strarray[]= name.toCharArray();
		
		for(char c: strarray) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
			
			
		}
		if(map.containsKey('a')) {
			System.out.println("occurance of a is "+map.get('a'));
		}
		
		
		
		System.out.println(map);
		
		
		}
}
