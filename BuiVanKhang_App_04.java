package BuiVanKhang_04;

import java.util.Scanner;

public class BuiVanKhang_App_04 {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        System.out.print("Nhap tu 1 den 12 : ");
        int month = input.nextInt();
        String monthYear;

        switch(month) {
            case 1:
            	monthYear = "January";
                break;
            case 2:
            	monthYear = "February";
                break;
            case 3:
            	monthYear = "March";
                break;
            case 4:
            	monthYear = "April";
                break;
            case 5:
            	monthYear = "May";
                break;
            case 6:
            	monthYear = "June";
                break;
            case 7:
            	monthYear = "July";
                break;
            case 8:
            	monthYear = "August";
                break;
            case 9:
            	monthYear = "September";
                break;
            case 10:
            	monthYear = "October";
                break;
            case 11:
            	monthYear = "November";
                break;
            case 12:
            	monthYear = "December";
                break;
            default:
            	monthYear = "Invalid input";
                break;
        }
        System.out.println("Thang vua nhap vao la : " + monthYear);
        input.close(); // close the scanner
	}
