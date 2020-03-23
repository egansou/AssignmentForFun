package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    	list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    	addShit(list1, list2);
    	int sum = 0;
    	int size = list1.size();
    	for(int i = 0; i < size; i++){
    		sum += list1.get(i);
    	}
    	
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
    	
		if (toRemove != null) {
			Iterator<Integer> itr = original.iterator();
			while (itr.hasNext()) {
				Integer number = itr.next();
				if (number == toRemove) {
					original.remove(number);
				}
			}
		}

        return original;
    }

    public boolean happyList(ArrayList<String> original) {
    	
    	if(original.size() < 2) return true;
    	
    	HashSet<Character> chars = null;
    	int size = original.size();
    	String str;
    	boolean val = false;
    	
    	for(int i = 0; i < size; i++){
    		
    		// Adding characters to an hash set
    		char [] wordToChar = original.get(i).toCharArray();
    		chars = new HashSet<Character>();
    		for (char c : wordToChar){
    			chars.add(c);
    		}
    		
    		//initializing values
    		str = "";
    		val = false;
    		
    		//Get the appropriate string whose value we need to check
    		if (i == 0) str = original.get(i + 1);
    		else if (i == (size - 1)) str = original.get(i - 1);
    		else str += original.get(i - 1) + original.get(i + 1);
    		
    		char [] toCheck = str.toCharArray();
    		//if it is happy
    		for (char c : toCheck){
        		if(chars.contains(c)){
        			val = true;
        			break;
        		}
        	}
    		
    		if (val == false) return val;
    	}
    		
        return val;
    }
}
