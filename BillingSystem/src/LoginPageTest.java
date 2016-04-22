import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;


public class LoginPageTest {

	@Test
	public void test() {
		// create a string variable for user-name and password
				String username = ("admin");
				String password = "12345";
				
				// create scanner object that will allow user to enter user-name and password
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter username");
				String user = scan.nextLine();
				
				System.out.println("Enter password");
				String pass = scan.nextLine();
				
				// compare the two String
				assertEquals(user, username);
				
				assertEquals(pass, password);
	}

}
