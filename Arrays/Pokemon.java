import java.util.Scanner;

public class Pokemon
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your 5 favorite pokemon.");
      
      String[] pokemon = new String[5];
      
      for( int i = 0; i < pokemon.length; i++ )
      {
         System.out.print("Enter next pokemon: ");
         pokemon[i] = scan.nextLine();
      } 
      
      int ans = countLetters( pokemon );
      System.out.println( ans );
           
   }//end main
   
   public static int countLetters( String[] arr )
   {
      int count = 0;
      for( String str : arr )
         count += str.length();
         
      return count;
   }//end countLetters
   
}//end class