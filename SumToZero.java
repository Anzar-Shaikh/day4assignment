package com.bl.corejava;

import java.util.Random;

class Sum {
    public Sum() {
        Random random = new Random();
        int[] array = new int[3];
        for (int i = 0; ; i++) {
            for (int j = 0; j < 3; j++) {
                int number = random.nextInt(10);
                array[j] = number;
            }
            if (array[0] + array[1] - array[2] == 0) {
                System.out.print("the 3 random number that has algebraic sum zero are : ");
                for (int ele : array) {
                    System.out.print(ele + " ");
                }
                break;
            } else if (array[0] - array[1] + array[2] == 0) {
                System.out.print("the 3 random number that has algebraic sum zero are : ");
                for (int ele : array) {
                    System.out.print(ele + " ");
                    break;
                }
            } else if (array[0] - array[1] - array[2] == 0) {
                System.out.print("the 3 random number that has algebraic sum zero are : ");
                for (int ele : array) {
                    System.out.print(ele + " ");
                    break;
                }
            }
        }
    }
}

public class SumToZero {
    public static void main(String[] args) {
        Sum sum = new Sum();
    }
}

