package org.howard.edu.lsp.midterm.question1;


public class SecurityOps {
	public static String encrypt(String text) {
		// go for it!!
		StringBuilder evenindex = new StringBuilder();
		StringBuilder oddindex = new StringBuilder(); 
	/**
	 * iterate through each character in the text
	 */
	for (int i = 0; i < text.length(); i++) {
		char c = text.charAt(i);
		/**
		 * check if the index is even or odd
		 */
		if(Character.isLetterOrDigit(c)) {
			
			if(i % 2 ==0) {
				evenindex.append(c);
			}
			else {
				oddindex.append(c);
			}
		}
	}
	
	
    /**
     * return encrypted results of both strings
     */
	return evenindex.toString() + oddindex.toString();
	}
}

