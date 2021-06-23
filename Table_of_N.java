package com.bl.corejava;

import java.util.Scanner;

class table {
    Scanner sc = new Scanner(System.in);
    public table() {
        System.out.print("Enter power of 2 (below 31) : ");
        int valeOfN = sc.nextInt();

        for (int i=1 ; i<=valeOfN ; i++) {
            int table = (int) Math.pow(2,i);
            System.out.println("2^" + i + " = " + table);
        }

    }
}

public class Table_of_N {
    public static void main(String[] args) {
        table printTable = new table();
    }
}
