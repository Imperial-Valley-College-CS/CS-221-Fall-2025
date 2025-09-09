import java.util.Scanner;

public class Card
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);  
      String answer;    
      do
      {
         System.out.print("Enter a card symbol: " );
         String symbol = scan.next().toLowerCase();    //scan symbol from user
         int lastIndex = symbol.length()-1;
         
         //create two variables by splitting symbol into rank and suit
         char rank = symbol.charAt(0);
         char suit = symbol.charAt(lastIndex);   
         
         String rankP = "";
         String suitP = "";   
         
         //create a switch for ranks
         switch( rank )
         {
            case '2': rankP = "Two of "; break;
            case '3': rankP = "Three of "; break;
            case '4': rankP = "Four of "; break;
            case '5': rankP = "Five of "; break;
            case '6': rankP = "Six of "; break;
            case '7': rankP = "Seven of "; break;
            case '8': rankP = "Eight of "; break;
            case '9': rankP = "Nine of "; break;
            case '1': rankP = "Ten of "; break;
            case 'j': rankP = "Jack of "; break;
            case 'q': rankP = "Queen of "; break;
            case 'k': rankP = "King of "; break;
            case 'a': rankP = "Ace of "; break;
         }
         
         //create a switch for suits
         switch( suit )
         {
            case 'c': suitP = "Clubs" ; break;
            case 'd': suitP = "Diamonds"; break;
            case 'h': suitP = "Hearts"; break;
            case 's': suitP = "Spades"; break;
         }
         
         System.out.println( rankP + suitP );
         System.out.println("Do you want to try another card? (yes/no)");
         answer = scan.next();
         
      }while( answer.equals("yes") );
   }
}