package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    static void calculate(int x, int y) {
        System.out.println("Distance is " + Math.pow((x * x + y * y), 0.5));
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of x : ");
            int x = sc.nextInt();
            System.out.println("Enter value of y : ");
            int y = sc.nextInt();
            calculate(x, y);
            sc.close();
        } catch (Exception e) {
            System.out.println("enter integer only");
        }
    }
}
