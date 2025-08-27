public class RockPaperScissors
{
   public static void main(String[] args)
   {
      //1-rock, 2-paper, 3-scissors
      int compHand = (int)(3*Math.random()) + 1;    //random number
      int userHand = 1;    //scan from user
      
      if( compHand == userHand )
      {
         System.out.println("It's a tie");
      }else if( (compHand == 1 && userHand == 3) || 
                (compHand == 2 && userHand == 1) || 
                (compHand == 3 && userHand == 2) )
      {
         System.out.println( "Computer wins!" );
         
      }else if( (userHand == 1 && compHand == 3) || 
                (userHand == 2 && compHand == 1) || 
                (userHand == 3 && compHand == 2) )
      {
         System.out.println( "You WIN!" );
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
   }
}