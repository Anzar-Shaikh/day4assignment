package com.bl.corejava;

import javax.swing.*;
import java.net.Inet4Address;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

class primeFactor {
    Scanner sc = new Scanner(System.in);
    public primeFactor() {
        int check =2;
        System.out.print("the prime factors of given number are : ");
        int num = sc.nextInt();
        while (num > 0) {
            if (num%check == 0) {
                System.out.print(check+ "\t");
                num = num/check;
            } else {
                check++;
            }
        }

    }

}
public class PrimeFactors {
    public static void main(String[] args) {
        primeFactor prime = new primeFactor();
    }
}
