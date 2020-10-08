/**
 *Author: Huda Abdulle
 *Date: Sep 24, 2020
 *Description:program assigns a new shark mail address to students (sharkmail.com)
 *system
 */
import java.util.Scanner;
public class EmailAddress {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);	
	System.out.println(" Welcome to sharkmail registration, what is your first name?");
	String firstName = keyboard.nextLine();
	System.out.println("What is your middle name?");
	String middleName = keyboard.nextLine();
	System.out.println("What is your last name?");
	String lastName = keyboard.nextLine();
	System.out.println("What is your birthdate?(mmddyyyy) ");
	String birthDate = keyboard.nextLine();
	System.out.println("Email:" + lastName.toLowerCase() + firstName.substring(0,1)     + middleName.substring(0,1)+  "@sharkmail.com" );
	System.out.println("Temp Password:"  + birthDate );
		//this line should do blank
	System.out.println("*** This temporary password is very insecure. Please change it immediately!***");
   //String lastName = keyboard.nextLine();
	

}
}
