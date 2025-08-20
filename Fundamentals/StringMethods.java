import java.util.Scanner;

public class StringMethods
{
   public static void main(String[] args)
   {
      String myName = "Octavio Ortiz";
      int space = myName.indexOf(' ');
      char lastI = myName.charAt(space+1);
      System.out.println( lastI );
      System.out.println( myName.substring(0,space) );
      System.out.println( myName.substring(space+1) );
   }
}