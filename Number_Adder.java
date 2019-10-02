import java.util.Scanner;

public class Number_Adder
{
   public static void main (String[] args){
       Scanner Sc = new Scanner(System.in);
        System.out.println("Number Adder");
         System.out.println("-----------------");
         
       
       int total = 0;
       int i = 0;
       while(i <= 0){
         System.out.print("Add ");
         int x = Sc.nextInt();
          System.out.println("");
         if(x<0)i = 1;
         else total = total +x;
           
        }
         System.out.println("Your total is "+total);
       
    }
}
