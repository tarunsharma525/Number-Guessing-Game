import java.util.Scanner;
import java.util.Random;

class Number_Guessing_Game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        int attempts = 0;
        System.out.println("Welcome to the Number Guessing Game!" + "\nI'm thinking of a number between 1 and 100." + "\nCan you guess it?" + "\nGood Luck!" + "\n" + "Let's begin!" + "\n");
        
        while(true){
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            if(guess == num){
                
                attempts++;
                break;
            }
            else{
                if(guess > num){
                    System.out.println("Too High! , try again");
                    attempts++;
                    

                }else if(guess < num){
                    System.out.println("Too Low! , try again");
                    attempts++;
                
                    

                }

            }

        }
        System.out.println("Correct!"+"\n"+"Congratulations!" + "\n" +" You guessed the number in " + attempts + " attempts.");

    }
}