package com.bl.corejava;

import java.util.Scanner;

class WindCh {
    Scanner sc = new Scanner(System.in);
    public WindCh() {
        System.out.println("Welcome to wind chill programe .");
        System.out.print("Enter temperature in fahrenheit (below 50) : ");
        double t = sc.nextDouble();
        System.out.print("Enter value of wind speed (between 3 to 120 ) : ");
        double v = sc.nextDouble();

        if (t<=50 && v>=3 && v<=120) {
            double w = 35.74+0.6215*t +(0.4275*t-35.75)*Math.pow(v,0.16);
            System.out.println("wind Chill = " + w);
        }
        else {
            System.out.println("Enter values as per instructions.");
        }
    }
}

public class WindChill {
    public static void main(String[] args) {
        WindCh windChill = new WindCh();
    }
}
