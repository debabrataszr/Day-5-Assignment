package com.bridgelabz;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("--Before swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("--After swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}