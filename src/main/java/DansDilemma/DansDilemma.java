package DansDilemma;

import java.util.HashSet;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
    	HashSet<Double> values = new HashSet<Double>();
    	Double [] args = {input1, input2};
    	int len = args.length;
    	
    	for(int i = 0; i < len; i++){
    		for(int j = 0; j < len; j++){
    			if (i != j){
    				values.add(args[i] + args[j]);
    				values.add(args[i] - args[j]);
    				values.add(args[i] * args[j]);
    			}	
    			if (i != j && args[j] != 0){
    				values.add(args[i] / args[j]);
    			}   		
        	}
    	}
    	
        return values.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
    	HashSet<Double> values = new HashSet<Double>();
    	Double [] args = {input1, input2, input3};
    	int len = args.length;
    	
    	for(int i = 0; i < len; i++){
    		for(int j = 0; j < len; j++){
    			if (i != j){
    				values.add(args[i] + args[j]);
    				values.add(args[i] - args[j]);
    				values.add(args[i] * args[j]);
    			}	
    			if (i != j && args[j] != 0){
    				values.add(args[i] / args[j]);
    			}   		
        	}
    	}
    	
        return values.size();
    }

    public Integer dilemmaOfN(Double... args){
    	HashSet<Double> values = new HashSet<Double>();
    	int len = args.length;
    	
    	for(int i = 0; i < len; i++){
    		for(int j = 0; j < len; j++){
    			if (i != j){
    				values.add(args[i] + args[j]);
    				values.add(args[i] - args[j]);
    				values.add(args[i] * args[j]);
    			}	
    			if (i != j && args[j] != 0){
    				values.add(args[i] / args[j]);
    			}   		
        	}
    	}
 
        return values.size();
    }
}
