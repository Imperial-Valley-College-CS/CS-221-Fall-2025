import java.util.Scanner;

public class UserInput
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("What's your name? ");
      String name = scan.nextLine();
      
      System.out.print("How old are you? ");
      int age = scan.nextInt();
   }
}