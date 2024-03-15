package org.howard.edu.lsp.midterm.question1;

/**
 * driver method
 */
public class Driver {
	/**
	 * runs implementation of my methods in SecurityOps.java
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
        String originalText = "I love CSCI363";
        String encryptedText = SecurityOps.encrypt(originalText);
        System.out.println("Original Text: " + originalText);
        System.out.println("Encrypted Text: " + encryptedText);
    }
}
