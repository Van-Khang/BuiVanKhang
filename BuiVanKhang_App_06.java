package BuiVanKhang_06;

import java.util.Scanner;

public class BuiVanKhang_App_06 {
	ublic static void main(String[] args) {
		try (Scanner d = new Scanner(System.in)) {
			System.out.println("Nhap vao 1 so nguyen duong : ");
			int a = d.nextInt();
			int b = 1;
			int i = 1;
			do {
				b = b*i;
				i++;
			}while(i<=a);

			System.out.println("Giai thua cua "+a +" la : "+b);
		}
	}

}
