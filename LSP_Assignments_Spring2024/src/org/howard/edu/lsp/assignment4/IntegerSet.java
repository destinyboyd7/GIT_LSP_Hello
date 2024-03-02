package org.howard.edu.lsp.assignment4;


import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Destiny Boyd 
 * @version 03/01/2024
 */
public class IntegerSet  {
	
	// Store the set elements in an ArrayList
	List<Integer> set = new ArrayList<Integer>();

	/**
	 * This method is a default constructor for the IntgerSet. 
	 */
	public IntegerSet() {
	};

	/**
	 * This method is a constructor if you want to pass in already initialized set. 
	 * @param set this variable is that set that is being initialized
	 */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	
	};
	
	
	/**
	 * This function will clear the values that are within the set. 
	 */
	public void clear() {
		set.clear();
	};
	
	/**
	 * The method will length of the set will be returned.  
	 * @return a keyword used to finish the execution of a method and return a values from a method
	 */
	public int length() {
		return set.size(); // returns the length
	}; 
	
	
	/*
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.  This overrides
     * the equal method from the Object class.
     */
	@Override
	public boolean equals(Object o) {
		if(this == o) { // checks if the sets are equal 
			return true; //returns true
		}
		else { //if sets are not equal false is returned 
			return false;	
		
		}
	};
	
	/**
	 * This method checks the values within the sets to see if the set already contains the value. 
	 * @param value this value variable will be the integer that is being compared to the values in the set already 
	 * @return will return a boolean value of true or false if the set contains the value then the return will be true, otherwise false. 
	 */
	public boolean contains(int value) {
		if (set.contains(value)) {
			return true; 
		}
		else {
			return false;
		}
	};
	
	/**
	 * This method will return the largest value in the set. 
	 * @return returns value of the largest integer in the set.
	 * @throws IntegerSetException throws exception if the set is empty because no value can be considered the largest.  
	 */
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException {
		if (set.isEmpty()){
			throw new  IntegerSetException();
		}
		int max = set.get(0);
		for(int num :set) {
			if (num > max){
				max = num;
			}
		}
		return max;
	}; 
	
	/**
	 * This method will return the smallest value in the set.
	 * @return returns value of the largest integer in the set.
	 * @throws IntegerSetException throws exception if the set is empty because no value can be considered the smallest.
	 */
	public int smallest() throws IntegerSetException{
		if (set.isEmpty()){
			throw new  IntegerSetException();
		}
		int min = set.get(0);
		for (int num : set) {
			if (num < min) {
				min = num;
			}
		}
		return min; 
	};

	/**
	 * This method adds items to the set that are not already there. 
	 * If an item is already in the set nothing will happen. 
	 * @param item item represents the value that is trying to be added to the set. 
	 */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    };
    
    /**
     * This method will remove an item from the set. 
     * If the item is not a value within the set nothing will happen. 
     * @param item item represents the value that is trying to be added to the set. 
     */
    public void remove(int item) {
    	 set.remove(Integer.valueOf(item));
    }; 

    /**
     * This method will output the result based on the union of the two sets. 
     * The union is considered items in both sets. 
     * @param intSetb this variable is the other set that the first set is 
     * being compared to as it adds the values to the first set. 
     */
    public void union(IntegerSet intSetb) {
    		set.addAll(intSetb.set);
    };

    /**
     * This method will output the result of the intersection between the two sets.
     * The intersection is considered to be values that both sets contain.  
     * @param intSetb this variable is the other set that the first set is being compared to. 
     */
    public void intersect(IntegerSet intSetb) {
    	set.retainAll(intSetb.set);
    }; 

    /**
     * This method will output the difference between setA and setB (SetA-SetB). 
     * It does this by removing all the values in SetA that are in SetB
     * @param intSetb  this variable is the other set that the first set is being compared to.
     */
    public void diff(IntegerSet intSetb) {
    	set.removeAll(intSetb.set);// set difference, i.e. s1 - s2
    };

    /**
     * This method will output the result of the complement of setA.
     * The complement represents all values that are not in setA.
     * it makes the array list values equal to the second list and removes all the values in that list that are in setA. 
     * @param intSetb this variable is the other set that the first set is being compared to.
     */
    public void complement(IntegerSet intSetb) {
    	List<Integer> complementSet = new ArrayList<>(intSetb.set);
        complementSet.removeAll(set);
        set = complementSet;
    };

    /**
     * checks if the set if the set is empty. if the set is empty returns boolean value true.
     * If set is not empty then the boolean method will return false. 
     * @return a keyword used to returns boolean value true or false. 
     */
    boolean isEmpty() {
    	if (set == null) {
    		return true;
    	}
    	else {
    		return false;
    	}
    };

    /**
     * This method will return the set value as a string. 
     * It will override the equal method from the object class. 
     */
    @Override
    public String toString() {
    	return set.toString();
    };
    
}
	
	
	

	
	


	
	 


	
	

	
	

