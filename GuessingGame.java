
import java.util.Scanner;

public class GuessingGame
{
    public static void String(String[] args){
     Scanner Sc = new Scanner(System.in);
     System.out.println("Welcome to the guessing game!");
     System.out.println("-----------------------------");
     System.out.println("");
     
     String YN = "y";
    while("y".equals(YN)){
        double z = (Math.random()*100)+1;
        int Random = (int)z;
        System.out.println("Im thinking of a number between 0 and 100");
            int guess = 0;
            int AG =0;
        while(guess != Random) {
            guess = Sc.nextInt();
            
           if(guess > Random){System.out.println("Too High...");  AG++; }
           else if(guess < Random){System.out.println("Too Low..."); AG++;  }
           else System.out.println("You got it!");
        
        }
      System.out.println("Nice Guess, It took you "+AG+" Tries.");
       System.out.println("Wanna play again? [y,n]");
        YN = Sc.nextLine();
        YN = Sc.nextLine();
    } 
    if("n".equals(YN)) System.out.println("Bye");
    else  System.out.println("What are you, Dyslexic?");
    
    }
}
