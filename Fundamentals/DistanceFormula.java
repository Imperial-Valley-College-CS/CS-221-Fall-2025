import java.util.Scanner;

public class DistanceFormula
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter location of x1: ");
      double x1 = scan.nextDouble();
      
      System.out.print("Enter location of y1: ");
      double y1 = scan.nextDouble();
      
      System.out.print("Enter location of x2: ");
      double x2 = scan.nextDouble();
      
      System.out.print("Enter location of y1: ");
      double y2 = scan.nextDouble();
      
      double a = x2-x1;
      double aa = Math.pow(a,2);
      double b = y2-y1;
      double bb = Math.pow(b,2);
      double dist = Math.sqrt(aa+bb);
      System.out.printf("Distance between (x1,y1) and (x2,y2) is %.1f",dist);
   }
}