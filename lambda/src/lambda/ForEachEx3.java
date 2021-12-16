package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachEx3 {

	public static void main(String[] args) {
		
		Map<String, Integer> items = new HashMap<String,Integer>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		items.put("G", 70);
		items.put("H", 80);
		
		//Item : A, Count : 10
		
		//java8 ÀÌÀü
		for(Map.Entry<String, Integer>entry:items.entrySet()) {
			System.out.println("Item : "+entry.getKey()+", Count: "+entry.getValue());
		}
		
		items.forEach((k,v) -> System.out.println("Item : "+k+", Count: "+v));
	}

}
