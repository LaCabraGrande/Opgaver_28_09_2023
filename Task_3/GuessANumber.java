//Task 3
import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;
   
    public static void main(String[] args) {
   
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}

    private static void makeAGuess(){
		Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
          int input = scanner.nextInt();
          if(input>=1 && input<=100) {
            if(input>rnd_number) {
              System.out.println("Your guess "+input+" is to high");
              makeAGuess(); 
            } else if(input<rnd_number) {
                System.out.println("Your guess "+input+" is to low");
                makeAGuess();           
            }  else {
                System.out.println("You guessed the right number");
            }    
          } else {
            System.out.println("You guessed "+input+" and that is not between 1 and 100");
            makeAGuess(); 
          }
        } else {
           System.out.println("You haven't typed an integer"); 
           makeAGuess(); 
        }
    }
}