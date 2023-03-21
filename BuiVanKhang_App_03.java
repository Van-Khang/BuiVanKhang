package BuiVanKhang_03;

import java.util.Scanner;

public class BuiVanKhang_App_03 {
	 public static void main(String[] args) {
			try (Scanner c = new Scanner(System.in)) {
				System.out.println("Enter your name : ");
				String str = c.nextLine();
				System.out.println("How old are you ? : ");
				int d = c.nextInt();

				if(d<16) {
					System.out.println("Ban "+ str + " o do tuoi vi thanh nien");
				}else if(d<18 && d>=16) {
					System.out.println("Ban "+ str + " o do tuoi truong thanh");
				}else {
					System.out.println("Ban "+ str + " da gia");
				}
			}
		}

}
