package Regex;

import java.util.regex.Pattern;

public class UserRegistration {
	/**
	 * Validation for first Name
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
}
