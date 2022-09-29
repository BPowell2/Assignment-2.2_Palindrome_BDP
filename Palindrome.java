/**
 * 9/25/22 This is the class with the method used to check if a string is a Palindrome or not
 * @author Benjamin Powell
 *9/25/22
 */
import java.util.*;
import java.io.*;

public class Palindrome {
	/*
	 * this is the method to check if a string is a Palindrome or not 
	 * @return boolean
	 */
	public static  boolean isPalindrome(String entry) {
		boolean didwork = false;
		char[] letters = new char[entry.length()];
		
		for(int i=0; i<entry.length();i++) {
			letters[i] = entry.charAt(i);
		}//end of first for loop
		//code for changing the string into a character array from geeks 2 geeks 
		Stack Stack1 = new Stack();
		
			for(int j=0;j<entry.length();j++) {
				Stack1.push(letters[j]);
			
			}//end of second for loop
				for(int n =0; n<letters.length; n++) {
					if(Stack1.pop().equals(letters[n])) {
						return true;
				
					
					}//end of if statement
					else 
						return false;
				
		
		}//end of third for loop
		System.out.println(didwork);
		return didwork;
	
	
	}//end of isPalindrome
}//end of class
