public class OneDimArrays
{
   public static void main(String[] args)
   {
   }
   
   public static int[] merge( int[] arr, int[] orr )
   {
      int[] newArr = new int[arr.length+orr.length];
      int i = 0; int j = 0; int k = 0;
      
      while( i < arr.length && j < orr.length )
      {
         if( arr[i] < orr[j] )
            newArr[k++] = arr[i++];
         else
            newArr[k++] = orr[j++];
      }
      
      while( i < arr.length )
         newArr[k++] = arr[i++];
         
      while( j < arr.length )
         newArr[k++] = orr[j++];
         
      return newArr;
   }
}