package com.bridgelabz;

    import java.util.Scanner;

    public class FlipCoin {

        public static void main(String[] args) {
            int heads = 0;
            int tails = 0;
            int count = 1;
            double random = 0.0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the number : ");
            int flips = sc.nextInt();

            while (count <= flips) {

                random = Math.random();
                System.out.print(count + " " + random);

                if (random < 0.5) {
                    heads++;
                    System.out.println("Heads");
                } else {
                    tails++;
                    System.out.println("Tails");
                }
                count++;
            }
            System.out.println();
            System.out.println("Number of Heads : " + heads);
            System.out.println("Number of Tails : " + tails);

            double headpercent = (double) heads / flips * 100;
            double tailpercent = (double) tails / flips * 100;

            System.out.println("Percentage of Heads : " + headpercent);
            System.out.println("Percnetage of Tails : " + tailpercent);
        }
}
