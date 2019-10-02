import java.util.Scanner;
public class Bar_Maker
{
 public static void String(String[] args){
     Scanner Sc = new Scanner(System.in);
     System.out.println("Bar Maker!");
  
     System.out.println("State what you wish your bar to be made of");
     String Bm = Sc.nextLine();
     char c = Bm.charAt(0);
     
        System.out.println("Incert how long you wnat your bar to be?");
     int x = Sc.nextInt();
     
     for(int i = 0; i < x; i++){
         System.out.print(c);
        }
     
     
     
    }
}
