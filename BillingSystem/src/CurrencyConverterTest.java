

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Scanner;
public class CurrencyConverterTest {
	// public integer variable declaration to hold amount
	int amount = 1200;
	
	//create scanner object
	Scanner sc = new Scanner(System.in);
	@Test
	public void test() {
		//prompt to user to enter amount 1200 
		System.out.println("Enter amount to convert, one thousand two hundred");
		
		int num = sc.nextInt();
		
		// test if the entry is number or string
		assertEquals(num, amount);
		
		
	}

}
