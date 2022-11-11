package calc;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		Scanner scanner = new Scanner(System.in);
		
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
	    
		int add = calc.add(number1,number2);
		int sub = calc.sub(number1, number2);
		double mul = calc.mul(number1,number2);
		double div = calc.div(number1,number2);
		
		System.out.println("add is"+ add);
		System.out.println("sub is"+ sub);
		System.out.println("mul is"+ mul); 
		System.out.println("div is"+ div);
	}
				
		public static int add(int number1, int number2) {
			return number1 + number2;
				}
		public static int sub(int number1, int number2) {
			return number1 - number2;
				}
		public static int mul(int number1, int number2) {
			return number1 * number2;
				}
		public static int div(int number1, int number2) {
			return number1 / number2;
				}	
}
		
		
		
		
		
		
		
//		 *
//		 * int num1, num2; Scanner in =new Scanner(System.in);
//		 * System.out.println("Enter the 1st nmber"); num1= in.nextInt();
//		 * 
//		 * System.out.println("Enter the 2nd number"); num2= in.nextInt();
//		 * 
//		 * 
//		 * System.out.println("add = "+(num1+num2));
//		 * System.out.println("sub = "+(num1-num2));
//		 * System.out.println("mul = "+(num1*num2));
//		 * System.out.println("div = "+(num1/num2));
//
