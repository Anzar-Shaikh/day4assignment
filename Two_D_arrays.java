package com.bl.corejava;
import java.util.Scanner;

class Array {
    Scanner sc = new Scanner(System.in);

    public Array() {
        System.out.print("Enter the number of rows : ");
        int numOfRows = sc.nextInt();
        System.out.print("\n"+"Enter number of columns : ");
        int numOfColumn = sc.nextInt();
        int [] [] array ;
        array = new int[numOfRows][numOfColumn];

        for (int i=0 ; i<array.length ; i++) {
            for (int j=0 ; j<array[i].length; j++) {
                System.out.print("Enter vale of array ["+ i+"] ["+j+"] : " );
                array[i] [j] = sc.nextInt();
            }
        }

        System.out.println("The two dimensional array is as follows : ");
        for (int i=0 ; i<array.length; i++) {
            for (int j=0; j<array[i].length ;j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}

public class Two_D_arrays {
    public static void main(String[] args) {
        Array array = new Array();
    }
}
