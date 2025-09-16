public class NumberSense
{
   public static void main(String[] args)
   {
      System.out.println( isPrime(47) );
      System.out.println( isPrime(81) );
      printFactors(24);
   }
   
   public static void printFactors( int num )
   {
      int i = 2;
      while( i <= num/2 )
      {
         if( num % i == 0 )   //true if num is evenly divisible by i 
            System.out.println(i); 
         
         i++;
      }        
   }
   
   public static boolean isPrime( int num )
   {
      int i = 2;
      while( i <= num/2 )
      {
         if( num % i == 0 )   //true if num is evenly divisible by i 
            return false; 
         
         i++;
      }        
      
      return true;
   }
}