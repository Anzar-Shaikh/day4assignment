package com.bl.corejava;


import java.util.Scanner;

class checkEnteredYear {
    Scanner scanner = new Scanner(System.in);
    int year;
    int count = 0;
    public boolean CheckEnteredYear1(){
        System.out.print("Enter year to check if it is leap year : ");
        year = scanner.nextInt();
        int check = year;
        while (check>0) {

            check = check/10 ;
            count = count + 1 ;
        }

        if ( count == 4 ) {
            return true;
        }
        else {
            System.out.println("Enter valid year.");
            return false;
        }
    }

}
class checkYear {
    checkEnteredYear yearCheck = new checkEnteredYear();
    public void check() {

        if (yearCheck.CheckEnteredYear1()) {
            int year1 = yearCheck.year;
            if (year1%400 == 0) {
                System.out.println("This is a leap year.");
            } else if ( (year1 % 4) == 0 && (year1 % 100) != 0) {
                System.out.println("This is a leap year.");
            }
            else {
                System.out.println("This is not leap year.");
            }
        }
    }
}

public class LeapYear {
    public static void main(String[] args) {
        checkYear run = new checkYear();
        run.check();
    }
}
