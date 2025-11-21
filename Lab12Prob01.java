/**
* File: Lab12Prob01.java
* Class: CSCI 1302 - Lab 12
* Author: Alex Verren, Jamari Sharp
* Created on: 11/21/25
* Last Modified: 11/21/25
* Description: Problem 1 of Lab 12
*/

public class Lab12Prob01 {
	public static int recursiveAbstract(int input) {
		// Recursion Function: f(n) = f(n-3) * (f(n-2)-(f(n-1))
		if (input == 0) return 1;
        if (input == 1) return 3;
        if (input == 2) return 4;

        return recursiveAbstract(input - 3) * (recursiveAbstract(input - 2) - recursiveAbstract(input - 1));
	}
	
	public static void main(String[] args) {
		System.out.println(recursiveAbstract(0));
	}
}
