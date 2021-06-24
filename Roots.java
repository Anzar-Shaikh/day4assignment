package com.bl.corejava;

import java.util.Scanner;

class Quadratic {
    Scanner sc = new Scanner(System.in);
    public Quadratic() {
        System.out.println("the quadratic equation is ax2 + bx + c = 0 ;");
        System.out.print("Enter value of a :");
        double a = sc.nextInt();
        System.out.print("Enter value of b :");
        double b = sc.nextInt();
        System.out.print("Enter value of c :");
        double c = sc.nextInt();
        System.out.println(" ");
        System.out.println("The equation formed is : "+a+"x2 + "+b+"x + "+c+" = "+0);

        double delta = Math.sqrt((b*b)-(4*a*c));
        System.out.println(delta);

        double root1 = ((-b+delta)/(2*a));
        double root2 = ((-b-delta)/(2*a));
        System.out.println("The two roots of formed quadratic equation are : " + root1+" & " + root2);

    }
}
public class Roots {
    public static void main(String[] args) {
        Quadratic equation = new Quadratic();
    }

}
