package assignment3;

import java.lang.Exception;

class InvalidCountryException extends Exception {

	private static final long serialVersionUID = 1L; // why?

	public InvalidCountryException() {
		super("Invalid Country! Must be India.");
	}
}

public class ques5 {

	public static void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India")) {
			throw new InvalidCountryException();
		}
	}

	public static void main(String[] args) {
		try{
			registerUser("AR", "usa");
		}
		catch(InvalidCountryException e) {
			e.printStackTrace();
		}
	}
}
