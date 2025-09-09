import java.util.Scanner;

public class EvenOrOdd
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a number: " );
      int num = scan.nextInt();
      
      int rem = num%2;
      
      if( rem == 0 )
         System.out.println("Number is even.");
      else
         System.out.println("Number is odd.");
   }
}