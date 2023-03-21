package BuiVanKhang_02;

import java.util.Scanner;

public class BuiVanKhang_App_02 {
	public static void main(String[] args) {
		try (Scanner b = new Scanner(System.in)) {
			System.out.println("Enter a number : ");
			int c = b.nextInt();

			if(c%2==0) {
				System.out.println("The number you just entered is an even number");
			}else {
				System.out.println("The number you just entered is odd");
			}
		}
	}

}
