package Collections;

import java.util.ArrayList;
import java.util.Map;

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
        return null;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        return null;
    }
}
