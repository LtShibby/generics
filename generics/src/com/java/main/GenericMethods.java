package com.java.main;

public class GenericMethods {

	public static void main(String[] args) {
		GenericMethods.genericsExample();
	}

	public static void genericsExample() {

		// Create an array of each: Integer, Double, Character
		// named intArray, doubleArray, charArray

		// Create an object of each: Integer, Double, Character
		// named exampleInteger, exampleDouble, exampleCharacter

		// Call printArray and printArrayTypes for each array above

		// Check if intArray contains exampleInteger

		// Check if intArray contains exampleDouble

		// Check if doubleArray contains exampleDouble

		// Check if doubleArray contains exampleCharacter

		// Check if charArray contains exampleCharacter

		// Check if charArray contains exampleInteger
	}

	/**
	 * Create a public static method that doesn't return anything called printArray
	 * that takes in an array called inputArray of generic objects and and prints
	 * it.
	 * 
	 * @param <A>
	 * @param inputArray
	 */
	// printArray method here

	/**
	 * Create a public static method that doesn't return anything called
	 * printArrayTypes that takes in an array called inputArray of generic objects
	 * and prints each object in the array's type.
	 * 
	 * @param <A>
	 * @param inputArray
	 */
	// printArrayTypes method here

	/**
	 * Create a public static method that returns true/false called
	 * checkArrayForType that takes in two generic parameters called inputArray and
	 * typeToSearchFor.
	 * 
	 * For Each element of the inputArray:
	 * 
	 * If any of them are of the same type as typeToSearchFor, print out a line to
	 * the console indicating the array contains an object of the input type and
	 * return true
	 * 
	 * If no objects in array are of the same type as typeToSearchFor, print out a
	 * line to the console indicating the array does not contain an object the input
	 * type and return false
	 * 
	 * @param <A>
	 * @param inputArray
	 * @param typeToSearchFor
	 * @throws MyCustomException
	 */

	// checkArrayForType method here

}
