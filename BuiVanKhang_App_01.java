package BuiVanKhang_01;

import java.util.Scanner;

public class BuiVanKhang_App_01 {
	public static void main(String[] args) {
    	try (Scanner a = new Scanner(System.in)) {
			System.out.println("Enter the first number : ");
			float firstNumber = a.nextFloat();
			System.out.println("Enter the second number : ");
			float secondNumber = a.nextFloat();

			System.out.println("Sum of two number : ");
			float Sum = firstNumber+secondNumber;
			System.out.println(Sum);

		 	System.out.println("Difference of two numbers: ");
			float Difference  = firstNumber-secondNumber;
			System.out.println(Difference);

			System.out.println("Product of two numbers : ");
			float Product = firstNumber*secondNumber;
			System.out.println(Product);

			System.out.println("quotient of two numbers : ");
			float quotient = firstNumber/secondNumber;
			System.out.println(quotient);

			System.out.println("percent of two numbers : ");
			float percent = firstNumber%secondNumber;
			System.out.println(percent);

			System.out.println("first number > second number ??? : "+(firstNumber > secondNumber));
			System.out.println("first number < second number ??? : "+(firstNumber < secondNumber));
			System.out.println("first number >= second number ??? : "+(firstNumber >= secondNumber));
			System.out.println("first number <= second number ??? : "+(firstNumber <= secondNumber));
			System.out.println("first number = second number ??? : "+(firstNumber == secondNumber));
			System.out.println("first number != second number ??? : "+(firstNumber != secondNumber));
		}

    }
}

