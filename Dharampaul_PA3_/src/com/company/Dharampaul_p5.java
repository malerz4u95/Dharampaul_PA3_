package com.company;

import java.security.SecureRandom;
import java.util.Scanner;



public class Dharampaul_p5 {
    public static int userDif() {
        int l = 0;
        int difficult = 0;

        System.out.println("What difficulty do you want between 1 and 4?");
        Scanner sc = new Scanner(System.in);

        difficult = sc.nextInt();


        return difficult;

    }
    public static int choice(){
        System.out.println("Choose: 1- Addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division");
        Scanner sc = new Scanner(System.in);
        int type=0;
        type= sc.nextInt();
        return type;
    }
    public static int question() {

        int random1 = 0;
        int random2 = 0;
        int l = 0;
        SecureRandom rand = new SecureRandom();

        int choose = 0;


        int ch = 0;
        ch = choice();


        int user = userDif();
        {
            if (user == 1) {
                random1 = rand.nextInt(10);
                random2 = rand.nextInt(10);
                {
                    if (ch == 1) {
                        System.out.println("How much is " + random1 + " plus " + random2 + "?");
                        choose = random1 + random2;
                    } else if (ch == 2) {
                        System.out.println("How much is " + random1 + " subtract " + random2 + "?");
                        choose = random1 - random2;
                    } else if (ch == 3) {
                        System.out.println("How much is " + random1 + " times " + random2 + "?");
                        choose = random1 * random2;
                    } else if (ch == 4) {
                        System.out.println("How much is " + random1 + " divided by " + random2 + "?");
                        choose = random1 / random2;
                    }

                }
            }
            else if (user == 2) {
                random1 = rand.nextInt(100);
                random2 = rand.nextInt(100);
                {
                    if (ch == 1) {
                        System.out.println("How much is " + random1 + " plus " + random2 + "?");
                        choose = random1 + random2;
                    } else if (ch == 2) {
                        System.out.println("How much is " + random1 + " subtract " + random2 + "?");
                        choose = random1 - random2;
                    } else if (ch == 3) {
                        System.out.println("How much is " + random1 + " times " + random2 + "?");
                        choose = random1 * random2;
                    } else if (ch == 4) {
                        System.out.println("How much is " + random1 + " divided by " + random2 + "?");
                        choose = random1 / random2;
                    }
                }
            } else if (user == 3) {
                random1 = rand.nextInt(1000);
                random2 = rand.nextInt(1000);
                {
                    if (ch == 1) {
                        System.out.println("How much is " + random1 + " plus " + random2 + "?");
                        choose = random1 + random2;
                    } else if (ch == 2) {
                        System.out.println("How much is " + random1 + " subtract " + random2 + "?");
                        choose = random1 - random2;
                    } else if (ch == 3) {
                        System.out.println("How much is " + random1 + " times " + random2 + "?");
                        choose = random1 * random2;
                    } else if (ch == 4) {
                        System.out.println("How much is " + random1 + " divided by " + random2 + "?");
                        choose = random1 / random2;
                    }
                }
            } else if (user == 4) {
                random1 = rand.nextInt(10000);
                random2 = rand.nextInt(10000);
                {
                    if (ch == 1) {
                        System.out.println("How much is " + random1 + " plus " + random2 + "?");
                        choose = random1 + random2;
                    } else if (ch == 2) {
                        System.out.println("How much is " + random1 + " subtract " + random2 + "?");
                        choose = random1 - random2;
                    } else if (ch == 3) {
                        System.out.println("How much is " + random1 + " times " + random2 + "?");
                        choose = random1 * random2;
                    } else if (ch == 4) {
                        System.out.println("How much is " + random1 + " divided by " + random2 + "?");
                        choose = random1 / random2;
                    }
                }
            }
        }
        return choose;
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
