import java.util.Scanner;

public class PerfectNumbers
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter an end value: ");
      int endValue = scan.nextInt();
      
      for(int num = 1; num <= endValue; num++)
      {
         //get all factors of num (including 1 and excluding the number)
         int sum = 0;
         //need an inner loop to identify the factors of num
         int i = 1;
         String factors = "";
         while( i <= num/2 )
         {
            if( num % i == 0 )
            {
               factors += i + " + ";
               sum += i;
            }
            i++;
         }
         if( num == sum )
            System.out.println( factors.substring(0,factors.length()-1) + "= " + num );
      }
   }
}