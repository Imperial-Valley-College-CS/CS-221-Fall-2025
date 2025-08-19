import java.util.Scanner;

public class DegFtoDegC
{
   public static void main(String[] args)
   {
      //Create a Scanner object
      Scanner scan = new Scanner(System.in);
      //Prompt user for temperature
      System.out.print("What's the temperature outside? ");
      double degF = scan.nextDouble();
      
      double degC = (5.0/9.0)*(degF-32.0);
      System.out.printf("%f degF is %.2f degC\n", degF, degC);
   }
}