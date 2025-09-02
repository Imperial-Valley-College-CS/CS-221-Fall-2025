public class Card
{
   public static void main(String[] args)
   {
      String symbol = "7c".toLowerCase();
      int lastIndex = symbol.length()-1;
      
      //create two variables by splitting symbol into rank and suit
      char rank = symbol.charAt(0);
      char suit = symbol.charAt(lastIndex);      
      
      //create a switch for ranks
      switch( rank )
      {
         case '2': System.out.print("Two of "); break;
         case '3': System.out.print("Three of "); break;
         case '4': System.out.print("Four of "); break;
         case '5': System.out.print("Five of "); break;
         case '6': System.out.print("Six of "); break;
         case '7': System.out.print("Seven of "); break;
         case '8': System.out.print("Eight of "); break;
         case '9': System.out.print("Nine of "); break;
         case '1': System.out.print("Ten of "); break;
         case 'j': System.out.print("Jack of "); break;
         case 'q': System.out.print("Queen of "); break;
         case 'k': System.out.print("King of "); break;
         case 'a': System.out.print("Ace of "); break;
      }
      
      //create a switch for suits
      switch( suit )
      {
         case 'c': System.out.println( "Clubs" ); break;
         case 'd': System.out.println( "Diamonds" ); break;
         case 'h': System.out.println( "Hearts" ); break;
         case 's': System.out.println( "Spades" ); break;
      }
   }
}