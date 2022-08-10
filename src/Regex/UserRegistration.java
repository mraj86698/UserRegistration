package Regex;

import java.util.regex.Pattern;

public class UserRegistration {

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
}
