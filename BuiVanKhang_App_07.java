package BuiVanKhang_07;

import java.util.Scanner;

public class BuiVanKhang_App_07 {
	 public static void main(String[] args) {
	    	System.out.print("Nhap so luong phan tu mang : ");
			try (Scanner b = new Scanner(System.in)) {
				int n = b.nextInt();
				int[] arr = new int[n];
				int tong = 0;
				for (int i = 0; i < n; i++) {
				    System.out.printf("a[%d] = ", i);
				    arr[i] = b.nextInt();
				    tong += arr[i];
				}
				float d = (float)tong / n;
				System.out.println("Trung binh cong cua "+n +" so nguyen duong da nhap la : "+d);
			}
	    }

}
