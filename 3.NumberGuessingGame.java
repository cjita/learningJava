//Build a "Number Guessing Game" where the user has to guess a randomly generated number.
import java.util.Scanner;

public class Main
{
public static void guessingNumberGame(){
    //generating random number between 1 to 100
    int number = 1 + (int)(100 *Math.random());
    //number of attempts
    int k=5;
    System.out.println("A number is chosen between 1 and 100 ");
    System.out.println("You have " + k + " attempts to guess the correct answer");
    Scanner sc = new Scanner(System.in);

    
    
    for(int i=0;i<k;i++){
        System.out.println("Guess a number");
        int guess = sc.nextInt();
        if(guess==number)
        {
            System.out.println("Congratulations your answer is correct");
            sc.close();
            return;
        }
        else if(guess<number)
        {
            System.out.println("The guessed number is less that randomly generated number");
        }
       else 
        {
            System.out.println("The guessed number is more that randomly generated number");
        }
        
    }

        System.out.println("You have exhausted all your attempts");
        sc.close();

    
}


	public static void main(String[] args) {
    guessingNumberGame();
	
	}	    
}
