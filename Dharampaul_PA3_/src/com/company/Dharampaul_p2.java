package com.company;

import java.security.SecureRandom;
import java.util.Scanner;



public class Dharampaul_p2 {
    public static int question() {
        SecureRandom rand = new SecureRandom();
        int random1 = rand.nextInt(10);
        int random2 = rand.nextInt(10);


        // Print random integers
        System.out.println("How much is " + random1 + " times " + random2);
        return random1 * random2;

    }

    public static int response() {
        SecureRandom rand = new SecureRandom();
        int random3 = rand.nextInt(5);

        return random3;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userNum;
        int num;
        int r;
        r = response();
        num = question();


        while (true) {
            userNum = sc.nextInt();
            if (userNum == num) {
                switch (r) {
                    case 1:
                        System.out.println("Very good!");

                        break;
                    case 2:
                        System.out.println("Excellent");

                        break;
                    case 3:
                        System.out.println("Nice Work");
                        break;
                    case 4:
                        System.out.println("Keep up the good work!");
                        break;
                }

            } else {
                switch (r) {
                    case 1:
                        System.out.println("No. Please try again.");

                        break;
                    case 2:
                        System.out.println("Wrong. Try once more.");

                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No. Keep Trying.");
                        break;
                }
            }
                num = question();
                r = response();
        }
    }
}