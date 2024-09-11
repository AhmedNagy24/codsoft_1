import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private static final int maxTrys = 10;
    private static final int lowBound = 1;
    private static final int highBound = 101;
    public static void main(String[] args) {
        int score = 0;
        Random rand = new Random(System.currentTimeMillis());
        System.out.println("Welcome to Number Game!");

        boolean play = true;
        while (play){
            int rNum = rand.nextInt(lowBound, highBound);
            boolean lose = true;
            int trialNum = 0;
            
            while (trialNum < maxTrys){
                System.out.println("Guess the number from 1 to 100!");
                int guess = new Scanner(System.in).nextInt();
                if (guess == rNum){
                    System.out.println("Your guess is Correct! You won the round.");
                    score++;
                    lose = false;
                    break;
                } else if (guess < rNum) {
                    trialNum++;
                    System.out.println(STR."Your guess is too low! You have \{maxTrys-trialNum} attempts left");
                } else{
                    trialNum++;
                    System.out.println(STR."Your guess is too high! You have \{maxTrys-trialNum} attempts left");
                }
            }
            if (lose){
                System.out.println("You lost the round!");
            }
            System.out.println(STR."Your score is \{score} rounds won.");
            System.out.println("""
                    Please choose an option by entering the number corresponding to it:
                    1- Play again
                    2- Exit""");
            int choice = new Scanner(System.in).nextInt();
            if (choice == 2){
                play = false;
            }
        }
    }
}