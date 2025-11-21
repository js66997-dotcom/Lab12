/**
* File: Lab12Prob02.java
* Class: CSCI 1302 - Lab 12
* Author: Alex Verren, Jamari Sharp
* Created on: 11/21/25
* Last Modified: 11/21/25
* Description: Problem 2 of Lab 12
*/

public class Lab12Prob02 {
	public static String reverseString(String input) {
		// if string is one character, return said character.
		if (input.length() <= 1) {
            return input;
        } else {
        	// Else return reversed string
        	return input.charAt(input.length() - 1) + reverseString(input.substring(0, input.length() - 1));
        }
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("Welcome"));
		System.out.println(reverseString("Home"));
		System.out.println(reverseString("Family"));
		System.out.println(reverseString("Hello World"));
	}
}
