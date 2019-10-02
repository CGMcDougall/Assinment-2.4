import java.util.Scanner;

public class Dice_Master
{
    public static void String(String[] args){
     Scanner Sc = new Scanner(System.in);
     
     System.out.println("D6 Dice Master!");
     System.out.println("---------------");
     System.out.println("");
     String YN = "y";
     
     while("y".equals(YN)){
         System.out.println("how many dice do you wish to roll?");
         int x = Sc.nextInt();
         System.out.print("you rolled a: ");
         int total = 0;
         for(int i = 0; i < x; i++){ 
            double z = (Math.random()*6)+1;
            int value = (int)z;
            System.out.print(" ");
            System.out.print(value);
            total = total +value;
            }
            System.out.println("");
            System.out.println("your total is "+total);
         System.out.println("Do you wish to Repeat this? [y,n]");
         System.out.println("");
         YN = Sc.nextLine();
          YN = Sc.nextLine();
        }
     if("n".equals(YN)) System.out.println("Bye");
     else  System.out.println("What are you, dyslexic?");
        
        
        
    }
}
