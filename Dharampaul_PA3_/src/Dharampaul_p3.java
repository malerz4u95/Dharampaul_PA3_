package com.company;

import java.security.SecureRandom;
import java.util.Scanner;



public class Dharampaul_p3 {
    public static int question() {
        SecureRandom rand = new SecureRandom();
        int random1 = rand.nextInt(10);
        int random2 = rand.nextInt(10);


        // Print random integers
        System.out.println("How much is " + random1 + " times " + random2 + "?");
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
        int i = 0;
        int j = 0;
        int k = 0;
        while (true) {
            while (i < 10) {
                {{
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
                        j++;

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
                        k++;
                    }

                    i++;}
                    num = question();
                    r = response();
                }


            }

            System.out.println("You did " + j + " problems right.");
            System.out.println("You did " + k + " problems wrong.");
            if (j > 7.5) {
                System.out.println("Congratulations, you are ready to go to the next level!");

            } else {

                System.out.println("Please ask your teacher for extra help.");


            }
            i = 0;
            num=question();
        }
    }
}
