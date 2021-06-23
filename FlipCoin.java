package com.bl.corejava;
import java.util.Scanner;

public class FlipCoin {
    Scanner scanner = new Scanner(System.in);
    public int getIntValue () {
        System.out.print("Enter the number of flips you wants : ");
        return scanner.nextInt();
    }
    public void flipCoin () {
        int numberOfFlip=getIntValue();
        double head =0,tail=0;
        for (int i =0 ; i<numberOfFlip; i++) {
            double side = Math.random();
            System.out.println(side);
            if (side < 0.5) {
                head++;
            }
            else {
                tail++;
            }
        }
        System.out.println("number of head count is : " + head);
        System.out.println("number of tail count is : " + tail);
        double headPercent = ((head*100)/numberOfFlip);
        double tailPercent = ((tail*100)/numberOfFlip);
        System.out.println("Head percentage is : " + headPercent + "%");
        System.out.println("Tail percentage is : " + tailPercent + "%");
    }
}
