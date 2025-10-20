import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Playlist
{
   public static void main(String[] args)
   {
      File f = new File("Songs.csv");
      try
      {
         Scanner scan = new Scanner(f);
         System.out.println( scan.nextInt() );
      }catch( FileNotFoundException e )
      {
         System.out.println(  "file not found" );
      }
   }
}