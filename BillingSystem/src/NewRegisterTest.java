

import static org.junit.Assert.*;
import java.util.Scanner;


import org.junit.Test;

public class NewRegisterTest {
	String first_name = "Badamasi";
	String second_name = "Yusuf";
	String username = "admin";
	String password = "12345";
	String phone_number = "01136553227";
	String address = "FTMS";
	String first, second, user, pass, phone, address1;
	Scanner scan = new Scanner(System.in);
	@Test
	public void test() {
		
		System.out.println("Enter the first name");
		first = scan.nextLine();
		
		System.out.println("Enter the second name");
		second = scan.nextLine();
		
		System.out.println("Enter username");
		user = scan.nextLine();
		
		System.out.println("Enter password");
		pass = scan.nextLine();
		
		System.out.println("Enter phone number");
		phone = scan.nextLine();
		
		System.out.println("Enter address");
		address1 = scan.nextLine();
		
		assertEquals(first, first_name);
		assertEquals(second, second_name);
		assertEquals(user, username);
		assertEquals(pass, password);
		assertEquals(phone, phone_number);
		assertEquals(address1, address);
	}

}
