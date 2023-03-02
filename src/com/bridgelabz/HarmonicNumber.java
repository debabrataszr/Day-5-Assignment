package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        double N, i;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        N = sc.nextDouble();
        for (i = 1; i <= N; i++) {
            sum = sum + (1 / i);
        }
        System.out.println("Harmonic value = " + sum);
    }
}

