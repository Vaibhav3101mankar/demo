package calculator;

import static org.junit.jupiter.api.Assertion.*;
import java.util.Scanner;
import org.junit.jupiter.apiTest;

public class calcTest {

	@Test
	public void testadd() {
		calculator calc =new calculator();
		try (Scanner Scanner = new Scanner.in)){
		int number1 = Scanner.nextInt();
		int number2 = Scanner.nextInt();
		 
		int add = calc.add(number1, number2);
		
		int expected = number1 + number2;
		assertEquals(expected, add);
		
		}
	}
	@Test
	public void testsub() {
		calculator calc =new calculator();
		try (Scanner Scanner = new Scanner.in)){
		int number1 = Scanner.nextInt();
		int number2 = Scanner.nextInt();
		 
		int sub = calc.sub(number1, number2);
		
		int expected = number1 - number2;
		assertEquals(expected, sub);
		
		}
	}
	@Test
	public void testmul(){
		calculator calc =new calculator();
		try (Scanner Scanner = new Scanner.in)){
		int number1 = Scanner.nextInt();
		int number2 = Scanner.nextInt();
		 
		int mul = calc.add(number1, number2);
		
		int expected = number1 * number2;
		assertEquals(expected,mul);
		
		}
	}
	@Test
	public void testdiv() {
		calculator calc =new calculator();
		try (Scanner Scanner = new Scanner.in)){
		int number1 = Scanner.nextInt();
		int number2 = Scanner.nextInt();
		 
		int div = calc.add(number1, number2);
		
		int expected = number1 / number2;
		assertEquals(expected, div);
		
		}
	}

}


