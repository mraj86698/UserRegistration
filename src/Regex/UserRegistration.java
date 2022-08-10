package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner sc = new Scanner(System.in);

	/**
	 * Validation for first Name First name starts with Cap and has minimum 3
	 * characters
	 */
	public void firstName() {
		System.out.print("Enter First Name : ");
		String FirstName = Utility.inputString();
		boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", FirstName);
		if (answer) {
			System.out.println("First Name is Valid");
		} else {
			System.out.println("First Name is Invalid ");
		}
	}

	/**
	 * Validation for LastName Last name starts with Cap and has minimum 3
	 * characters
	 */
	public void lastName() {
		System.out.print("Enter Last Name : ");
		String LastName = Utility.inputString();
		boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", LastName);
		if (answer) {
			System.out.println("Last Name is Valid");
		} else {
			System.out.println("Last Name is Invalid ");
		}
	}

	/**
	 * Validation for Email E.g. abc.xyz@bl.co.in
	 * Email has 3 mandatory parts (abc, bl & co)
	 * 2 optional (xyz & in) with precise @ and . positions
	 */
	public void email() {
		System.out.print("Enter Email Id : ");
		String Email = Utility.inputString();
		boolean answer = Pattern.matches("[a-z]+([.][a-z]+)*@bl[.]co([.]in)*", Email);
		if (answer) {
			System.out.println("Email is Valid");
		} else {
			System.out.println("Email is Invalid ");
		}
	}

	/**
	 * Validation for Mobile Number E.g. 91 9374930253
	 * Country code Follow by space and 10 digit number.
	 */

	public void mobileNumber() {
		System.out.print("Enter MobileNumber : ");
		String MobileNumber = sc.nextLine();
		boolean answer = Pattern.matches("91\\s[6789]{1}[0-9]{9}", MobileNumber);
		if (answer) {
			System.out.println("Phone Number is Valid");
		} else {
			System.out.println("Phone Number is Invalid ");
		}
	}

	/**
	 * Password Rule 1
	 * Minimum 8 Character
	 */
	public void password1() {

		System.out.print("Enter password  :: ");
		String password = sc.nextLine();
		boolean answer = Pattern.matches("[a-zA-Z0-9]{8,}", password);
		if (answer) {
			System.out.println("Password is Valid");
		} else {
			System.out.println("Password is Not Valid");
		}
	}

	/**
	 * Password Rule 2
	 * Minimum 8 Character
	 * AtLeast 1 UpperCase
	 */
	public void password2() {

		System.out.print("Enter password  :: ");
		String password = sc.nextLine();
		boolean answer = Pattern.matches("[A-Z]+[a-z0-9]{7,}", password);
		if (answer) {
			System.out.println("Password is Valid");
		} else {
			System.out.println("Password is Not Valid");
		}
	}

	/**
	 * Password Rule 2
	 * Minimum 8 Character
	 * AtLeast 1 UpperCase
	 * AtLeast 1 Numeric Number
	 */

	public void password3() {

		System.out.print("Enter password  :: ");
		String password = sc.nextLine();
		boolean answer = Pattern.matches("[A-Z]+[a-z]{6,}+[0-9]", password);
		if (answer) {
			System.out.println("Password is Valid");
		} else {
			System.out.println("Password is Not Valid");
		}
	}
	/**
	 * Password Rule 2
	 * Minimum 8 Character
	 * AtLeast 1 UpperCase
	 * AtLeast 1 Numeric Number
	 * Atleast 1 Special Character
	 */

	public void password4() {

		System.out.print("Enter password  :: ");
		String password = sc.nextLine();
		boolean answer = Pattern.matches("[A-Z]+[a-z]{5,}+[0-9]+[*.!@#$%^&(){}[]:;<>,.?/~_+-=|\\]", password);
		if (answer) {
			System.out.println("Password is Valid");
		} else {
			System.out.println("Password is Not Valid");
		}
	}
	/**
	 * Validation of Email Id
	 * A-Z characters allowed
	 * a-z characters allowed
	 * 0-9 numbers allowed
	 * Additionally email may contain only dot(.), dash(-) and underscore(_)
	 * Rest all characters are not allowed.
	 */

	public void emailValidation() {
		System.out.print("Enter Email Id : ");
		String Email = Utility.inputString();
		boolean answer = Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", Email);
		if (answer) {
			System.out.println("Email is Valid");
		} else {
			System.out.println("Email is Invalid ");
		}
	}


}
