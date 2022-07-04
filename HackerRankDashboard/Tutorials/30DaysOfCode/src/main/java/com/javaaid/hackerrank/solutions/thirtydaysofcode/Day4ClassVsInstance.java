/**
 * 
 * Problem Statement-
 * [Class vs. Instance](https://www.hackerrank.com/challenges/30-class-vs-instance/problem)
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

/**
 * @author Kanahaiya Gupta
 *
 */
class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(int initialAge) {
		if (initialAge < 0) {
			System.out.println("Age is not valid, setting age to 0.");
		}
		this.age = initialAge;
		// Add some more code to run some checks on initialAge
	}

	public Person(String firstName, String lastName, int initialAge) {
		if (firstName.equals("")) {
			System.out.println("First Name is not valid, setting first name to not empty string.");
		} else if (lastName.equals("")) {
			System.out.println("Last Name is not valid, setting last name to not empty string.");
		} else if (initialAge < 0) {
			System.out.println("Age is not valid, setting age to 0.");
		}
                this.firstName = firstName;
                this.lastName = lastName;
		this.age = initialAge;
		// Add some more code to run some checks on initialAge
	}

	public void amIOld() {
		// Write code determining if this person's age is old and print the correct
		// statement:
		if (age < 13) {
			System.out.println("You are young.");
		} else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");

		} else {
			System.out.println("You are old.");
		}

	}

	public void yearPasses() {
		// Increment this person's age.
		this.age++;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
}
