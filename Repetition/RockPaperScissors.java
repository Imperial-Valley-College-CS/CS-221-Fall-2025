import java.util.Scanner;

public class RockPaperScissors
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String answer;
      int userScore = 0;
      int compScore = 0;
      
      do
      {
         //1-rock, 2-paper, 3-scissors
         int compHand = (int)(3*Math.random()) + 1;    //random number
         System.out.print("Enter 1-rock, 2-paper, 3-scissors: ");
         int userHand = scan.nextInt();    //scan from user
         
         if( compHand == userHand )
         {
            System.out.println("It's a tie");
         }else if( (compHand == 1 && userHand == 3) || 
                   (compHand == 2 && userHand == 1) || 
                   (compHand == 3 && userHand == 2) )
         {
            System.out.println( "Computer wins!" );
            compScore++;
            
         }else if( (userHand == 1 && compHand == 3) || 
                   (userHand == 2 && compHand == 1) || 
                   (userHand == 3 && compHand == 2) )
         {
            System.out.println( "You WIN!" );
            userScore++;
         }
         
         switch( compHand )
         {
            case 1:
               System.out.println("Computer is Rock");
               break;
            case 2:
               System.out.println("Computer is Paper");
               break;
            case 3:
               System.out.println("Computer is Scissors");
               break;
         }
         
         System.out.print("Do you want to play again? (yes/no) ");
         answer = scan.next();
                  
      }while( answer.equals("yes") );
      
      System.out.println( "Thanks for playing :)" );
      System.out.println( "User Score: " + userScore );
      System.out.println( "Computer Score: " + compScore );
      
   }//end main method
}//end class