package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2.concat(string1);
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
    	StringBuilder s = new StringBuilder();
    	int len = string.length();
    			
    	for (int i = 0; i < len; i++){
    		s.append(" ");
    	}
    	
        return s.toString();
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
    	StringBuilder s = new StringBuilder();
    	int len = string.length();
    	
    	for(int i = 0; i < len; i++){
    		char ch = string.charAt(i);
    		if(Character.isLowerCase(ch)){
    			s.append(Character.toUpperCase(ch));
    		}
    		else s.append(Character.toLowerCase(ch));
    	}
    	
        return s.toString();
    }

    public String oneAtATime(String string1, String string2) {
    	StringBuilder s = new StringBuilder();
    	int len1 = string1.length();
    	int len2 = string2.length();
    	
    	int i = 0; 
    	while (i < len1 || i < len2){
    		if (i < len1) s.append(string1.charAt(i));
    		if (i < len2) s.append(string2.charAt(i));
    		i++;
    	}
    	
    	//System.out.println(s.toString());
        return s.toString();
    }
}
