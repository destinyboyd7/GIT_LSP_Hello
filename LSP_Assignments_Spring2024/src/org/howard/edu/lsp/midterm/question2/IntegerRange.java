package org.howard.edu.lsp.midterm.question2;

/**
 * @author Destiny Boyd
 * @version: 03/14/2024 
 * Midterm question 2
 */
public class IntegerRange {
	private int lowerBound;
	private int upperBound;
	
	
	/**
	 * a constructor used to define the lower and upper bounds 
	 * @param lowerBound the lower bound in the range 
	 * @param upperBound the upper bound in the range
	 */
	public IntegerRange(int lowerBound, int upperBound) {
		this.lowerBound = lowerBound; 
		this.upperBound = upperBound; 
	};
	
	/**
	 * Checks if the value is in the range. 
	 * @param value the specified value that is being checked 
	 * @return will return true if value is with the range or will return false if otherwise
	 */
	public boolean contains( int value ) {
		if (value >= lowerBound && value <= upperBound) {
			return true;
		}
		else {
			return false;
		}
	}; 
	
	/**
	 * Checks if the receiver contains at least one values in common with other 
	 * @param other refers to the other range 
	 * @return will return true if an overlapping value is found if not false will be returned. 
	 */
	//@Override
	//public boolean overlaps(Range other) {
		//for(int i = lowerBound; i<=upperBound; i++) {
			//if(other.contains(i)) {
			//	return true;
			//}
			//else {
			//	return false;
			//}
		//}
	//};
	
	/**
	 * this method will return the number of integers in the range
	 * @return value of size that is calculated. 
	 */
	// // Returns the number of integers in the range
	public int size() {
		return upperBound - lowerBound + 1; 
	}; 
	
	/**
	 * Checks if two ranges are equal based on if their lower and upper bound are the same. 
	 */
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		else { 
			return false;
		}
	}
	
}


