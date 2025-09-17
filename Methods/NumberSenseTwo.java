public class NumberSenseTwo
{
   public static int REVERSE(int num)
   {
      String str = num+"";
      String empty = "";
      for( int i = 0; i < str.length(); i++)
      {
         empty = str.charAt(i) + empty;
      }
      int newNum = Integer.parseInt( empty );
      return newNum;
   }

   public static int reverse(int num)
   {
      int sum = 0;
      int exp = (num+"").length()-1;
      while( num > 0 )
      {
         int lastDigit = num % 10;     //gives remainder of num divided by 10
         sum = sum + lastDigit*(int)Math.pow(10,exp);
         num = num/10;
         exp--;
      }
      return sum;
   }
   
   public static void main(String[] args)
   {
      System.out.println( REVERSE(2345) );
   }   
}