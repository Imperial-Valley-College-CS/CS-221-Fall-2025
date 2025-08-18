import java.util.Scanner;

public class UserInput
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("What's your name? " );
      String name = scan.nextLine();      //scans next token as a String
      
      System.out.print("How old are you? ");
      int age = scan.nextInt();     //scans next token as int
      
      System.out.println("Your name is " + name);
      System.out.println("You are " + age + " years old.");
   }
}