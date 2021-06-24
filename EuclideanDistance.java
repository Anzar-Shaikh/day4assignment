package com.bl.corejava;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

class Distance {
    Scanner sc = new Scanner(System.in);
    public Distance() {
        System.out.print("Enter number on x-axis : ");
        double x_axis = sc.nextInt();
        System.out.print("Enter number on y-axis : ");
        double y_axis = sc.nextInt();
        double dist = Math.sqrt((Math.pow(x_axis,2)+(Math.pow(y_axis,2))));
        System.out.print("Distance of ("+ x_axis+ ","+y_axis +") form origin (0,0) is : " + dist);
    }


}

public class EuclideanDistance {
    public static void main(String[] args) {
        Distance dist = new Distance();


    }
}
