package Regex;

import java.util.regex.Pattern;

public class UserRegistration {
	/**
	 * Validation for first Name
	 * First name starts with Cap and has minimum 3 characters
	 */
	public void firstName() {
		System.out.print("Enter First Name :: " );
		String FirstName = Utility.inputString();
		boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}",FirstName);
		if (answer) {
			System.out.println("First Name is Valid");
		}
        else {
        	System.out.println("First Name is Invalid ");
        }
	}
	/**
	 * Validation for LastName
	 * Last name starts with Cap and has minimum 3 characters
	 */
	public void lastName() {
		System.out.print("Enter Last Name :: " );
		String LastName = Utility.inputString();
		boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}",LastName);
		if (answer) {
			System.out.println("Last Name is Valid");
		}
        else {
        	System.out.println("Last Name is Invalid ");
        }
	}

	/**
	 * Validation for Email
	 * E.g. abc.xyz@bl.co.in
	 * Email has 3 mandatory parts (abc, bl & co)
	 * 2 optional (xyz & in) with precise @ and . positions
	 */
	public void email() {
		System.out.print("Enter Email Id :: " );
		String Email = Utility.inputString();
		boolean answer = Pattern.matches("[a-z]+([.][a-z]+)*@bl[.]co([.]in)*",Email);
		if (answer) {
			System.out.println("Email is Valid");
		}
        else {
        	System.out.println("Email is Invalid ");
        }
	}



}
