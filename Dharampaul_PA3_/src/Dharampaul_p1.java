
import java.security.SecureRandom;
import java.util.Scanner;



public class Dharampaul_p1 {
    public static int question() {
        SecureRandom rand = new SecureRandom();
        int random1 = rand.nextInt(10);
        int random2 = rand.nextInt(10);


        // Print random integers
        System.out.println("How much is " + random1 + " times " + random2);
        return random1 * random2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userNum;
        int num;
        num = question();

        while(true){
            userNum = sc.nextInt();

            if(userNum==num){
                System.out.println("Very good!");
                num = question();
            }
            else{
                System.out.println("No. Please try again.");
            }
        }
    }
}