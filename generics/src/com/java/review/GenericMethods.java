package com.java.review;

public class GenericMethods {
	

	public static void main(String[] args) {
		GenericMethods.genericsExample();
	}

	/**
	 * Create a public static method that doesn't return anything called printArray that takes in an array called
	 * inputArray of generic objects and and prints it.
	 * 
	 * @param <A>
	 * @param inputArray
	 */

	public static <A> void printArray(A[] inputArray) {
		// Display array elements
		for (A element : inputArray) {
			System.out.printf("%s ", element);
		}
	}

	/**
	 * Create a public static method that doesn't return anything called printArrayTypes that takes in an array called
	 * inputArray of generic objects and prints each object in the array's type.
	 * 
	 * @param <A>
	 * @param inputArray
	 */
	public static <A> void printArrayTypes(A[] inputArray) {
		// Display array elements
		for (A element : inputArray) {
			System.out.printf("%s ", element.getClass());
		}
		System.out.println();
	}


	/**
	 * Create a public static method that returns true/false called checkArrayForType that 
	 * takes in two generic parameters called inputArray and typeToSearchFor.
	 * 
	 * For Each element of the inputArray: 
	 * 
	 * If any of them are of the same type as typeToSearchFor, 
	 * print out a line to the console indicating the array contains an object of the input type
	 * and return true 
	 * 
	 * If no objects in array are of the same type as typeToSearchFor, 
	 * print out a line to the console indicating the array does not contain an object the input type 
	 * and return false
	 * 
	 * @param <A>
	 * @param inputArray
	 * @param typeToSearchFor
	 * @throws MyCustomException
	 */
	public static <A> boolean checkArrayForType (A[] inputArray, A typeToSearchFor) {
		for (A element : inputArray) {

			if (element.getClass().equals(typeToSearchFor.getClass())) {
				System.out.print("The array: ");
				GenericMethods.printArray(inputArray);
				System.out.print("contains an object of type " + typeToSearchFor.getClass() +"\n\n");
				return true;
			}

		}
		System.out.print("The array: ");
		GenericMethods.printArray(inputArray);
		System.out.print(" does not contain an object of type " + typeToSearchFor.getClass() +"\n\n");
		return false;
	}
	
	public static void genericsExample() {
		
		// Create an array of each: Integer, Double, Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		
		Integer exampleInteger = 1;
		Double exampleDouble = 1.0;
		Character exampleCharacter = 'a';

		// Call printArray and printArrayTypes for each array above
		
		System.out.println("Array integerArray contains:");
		GenericMethods.printArray(intArray); 
		GenericMethods.printArrayTypes(intArray); 
		System.out.println();
		
		System.out.println("\nArray doubleArray contains:");
		GenericMethods.printArray(doubleArray);
		GenericMethods.printArrayTypes(doubleArray);  
		System.out.println();
		
		System.out.println("\nArray characterArray contains:");
		GenericMethods.printArray(charArray);
		GenericMethods.printArrayTypes(charArray); 
		System.out.println();
		

		// Check if intArray contains exampleInteger
		GenericMethods.checkArrayForType(intArray, exampleInteger);
		

		// Check if intArray contains exampleDouble
		GenericMethods.checkArrayForType(intArray, exampleDouble);

		// Check if doubleArray contains exampleDouble
		GenericMethods.checkArrayForType(doubleArray, exampleDouble);
		
		// Check if doubleArray contains exampleCharacter
		GenericMethods.checkArrayForType(doubleArray, exampleCharacter);

		// Check if charArray contains exampleCharacter
		GenericMethods.checkArrayForType(charArray, exampleCharacter);
		
		// Check if charArray contains exampleInteger
		GenericMethods.checkArrayForType(charArray, exampleInteger);
	}
}
