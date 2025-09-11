import java.util.Scanner;

public class Hangman
{
   public static void main(String[] args)
   {
      String word = "summer";
      String guess = "++++++";
      Scanner scan = new Scanner(System.in);
      
      do
      {
         String empty = "";
         System.out.print("Enter a letter: ");
         char let = scan.next().charAt(0);      //scans a String and grabs first character
         
         for( int i = 0; i < word.length(); i++ )
         {
            if( word.charAt(i) == let )
               empty = empty + let;
            else
               empty = empty + guess.charAt(i);
         }
         guess = empty;        
         System.out.println( guess );
      }while( !word.equals(guess) );
   }
}