package com.hubgitalvin.wk4.usrserv;

/*
 * Exercise: Parse a String
 *     Create a method (inside of the UserService you created earlier) 
 *     that looks like this:

public String[] parseText(String input) {

  // put your code here

}

 * This method will take the following String as 
 * input: "exampleUsername,examplePassword,exampleName"
 * And it should return an array of Strings with three 
 * elements inside: ["exampleUser", "examplePassword", "exampleName"]
 * 
 */

public class UserService {

	public static void main(String[] args) {
		
		String[] objIn = new String[3];
		
		objIn[0] = "keypeele1985@humor.com";
		objIn[1] = "uDum@$$96";
		objIn[2] = "A.A.Ron Bala-Ke";
		
		User alvUser = CreateUser(objIn); 
		
		String testInput = "exampleUsername,examplePassword,exampleName"; 
		String[] parsedString = parseText(testInput);
		
	}
	
	public static User CreateUser(String[] usrTraits) {

		User myUser = new User(); 

		myUser.setUserName(usrTraits[0]); 
		myUser.setPassword(usrTraits[1]); 
		myUser.setName(usrTraits[2]); 
	
		return myUser; 
	
	}
	
	public static String[] parseText(String input) {

		String outStringArray[] = input.split(","); 
		
		return outStringArray; 

	}

}
