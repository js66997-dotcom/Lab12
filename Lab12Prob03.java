/**
* File: Lab12Prob03.java
* Class: CSCI 1302 - Lab 12
* Author: Alex Verren, Jamari Sharp
* Created on: 11/21/25
* Last Modified: 11/21/25
* Description: Problem 3 of Lab 12
*/

public class Lab12Prob03 {
	public static String reverseString(String input) {
		// if string is one character, return said character.
		if (input.length() <= 1) {
            return input;
        } else {
        	// Else return reversed string
        	return input.charAt(input.length() - 1) + reverseString(input.substring(0, input.length() - 1));
        }
	}
	
	private static String reverseString(String str, int index) {
		// If 0, return the first character in the string.
		if (index == 0) {
            return str.substring(0, 1);
        } else { 
        	return str.charAt(index) + reverseString(str, index - 1); 
        }
    }
	
	public static void main(String[] args) {
		System.out.println(reverseString("Welcome"));
		System.out.println(reverseString("Home"));
		System.out.println(reverseString("Family", 2));
		System.out.println(reverseString("Hello World", 4));
	}
}
