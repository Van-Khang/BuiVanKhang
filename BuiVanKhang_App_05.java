package BuiVanKhang_05;

import java.util.Scanner;

public class BuiVanKhang_App_05 {
	public static void main(String[] args) {
		try (Scanner d = new Scanner(System.in)) {
			System.out.println("Nhap vao so nguyen bat ki : ");
			int Sum = d.nextInt();
			while(Sum<100){
				System.out.println("Nhap them vao so nguyen bat ki : ");
				int b = d.nextInt();
				Sum += b;
			}

			System.out.println("Tong cac so vua nhap vao la : "+Sum );
		}
	}

}
