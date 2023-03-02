package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
    static void roots(int a, int b, int c) {

        int delta = Math.abs(b * b - 4 * a * c);
        double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
        double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a ");
            int a = sc.nextInt();
            System.out.println("Enter b");
            int b = sc.nextInt();
            System.out.println("Enter c");
            int c = sc.nextInt();
            roots(a, b, c);
        } catch (Exception e) {
            System.out.println("Enter correct input");
        }
        sc.close();
    }
}


