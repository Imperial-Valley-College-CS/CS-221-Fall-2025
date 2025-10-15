public class TestCard
{
   public static void main(String[] args)
   {
      Card tenD = new Card("10D");
      Card aceH = new Card("AH", 1);
      Card twoC = new Card("2C", 2);
      Card jackS = new Card("JS");
      
      int num = tenD.compareTo(aceH);
      System.out.println( num );
   }
}