package Collections;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
    	ArrayList<Object> keys = new ArrayList<Object>();
    	for (Object key : map.keySet()) {
    		  if (findValueOf(map, key).equals(value)) {
    		    keys.add(key);
    		  }
    		}
        return keys.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
    	Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
    	fibonacciTreeHelper(map, size);
        return map;
    }

    private int fibonacciTreeHelper(Map<Integer, Integer> map, int size) {
    	
		if (size == 0) return 0;
		else if (size == 1){
			map.put(1, 1);
			return 1;
		}
		else {
			int val =  fibonacciTreeHelper(map, size - 1) + fibonacciTreeHelper(map, size - 2);
			map.put(size, val);
			return val;			
		}
		
		
	}

	public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		crazySpiralTreeHelper(map, first, second, size);
        return map;
    }
	
	private int crazySpiralTreeHelper(Map<Integer, Integer> map, Integer first, Integer second, Integer size) {
    	
		if (size == 0){
			return 0;
		}
		if (size == 1){
			map.put(1, first);
			return first;
		}
		if (size == 2){
			map.put(1, first);
			map.put(2, second);
			return second;
		}
		else {
			int val =  crazySpiralTreeHelper(map, first, second, size - 1) + 
					crazySpiralTreeHelper(map, first, second, size - 2);
			map.put(size, val);
			return val;			
		}
		
		
	}
	
	
}
