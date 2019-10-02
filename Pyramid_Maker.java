import java.util.Scanner;
public class Pyramid_Maker
{
    public static void String(String[] args){
        Scanner Sc = new Scanner(System.in);
         System.out.println("Pyramid Maker");
          System.out.println("-------------");
           System.out.println("");
           
     System.out.println("State what Character you wish your Pyramid to be made of");
     String Bm = Sc.nextLine();
     char c = Bm.charAt(0);
     
      System.out.println("How Big do you want it to be?");
     int x = Sc.nextInt();
     
     
     for(int i = 1; i <= x; i++){
         for(int z = 1; z <= i; z++){
             //int y = (x-i)/2 + 1;
             //for(int Y1 = 0; Y1 < y; Y1++){System.out.print(" ");}
             System.out.print(c);
             
             
            }
             System.out.println("");
        }
        
        
        
    }
}
