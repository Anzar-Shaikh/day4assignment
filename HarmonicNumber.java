package com.bl.corejava;

import java.util.Scanner;

class HarmonicNum {
    Scanner sc = new Scanner(System.in);

    public void Number(){
        System.out.print("Enter Number to print harmonic number : ");
        int num = sc.nextInt();
        double count = 0;
        for (int j=1 ; j<=num ; j++) {
            if (j<num) {
                System.out.print("1/" + j + "+");
            }
            else  {
                System.out.println("1/" + j);
            }
        }
        for (double i=1 ; i<=num ; i++) {
            double sum = 1/i;
            count = count + sum;
        }
        System.out.println("The sum of harmonic number is : " + count);
    }
}
public class HarmonicNumber {
    public static void main(String[] args) {
        HarmonicNum har = new HarmonicNum();
        har.Number();

    }
}
