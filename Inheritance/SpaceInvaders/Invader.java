import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Invader
{
   //data fields
   protected Position position;
   protected int health;
   protected boolean[][] body = new boolean[8][12];
   protected String matDir = "InvaderMatrices";
   protected String filename;  //will be matDir + "SquidMatrix.txt"
   
   //constructor
   public Invader( int xx, int yy )
   {
      this.position = new Position(xx, yy);
      //setBody();
   }
   
   protected void setBody()
   {
      File f = new File(filename);
      try
      {
         Scanner scan = new Scanner(f);
         for( int i = 0; i < body.length; i++ )
         {
            String line = scan.nextLine();
            System.out.println( line );
         }
      }catch(FileNotFoundException e)
      {
         System.out.println( filename + " not found." );
      }
   }
}