public class Squid extends Invader
{
   //data fields
   private String[] squidFiles = {"/SquidMatrix.txt"};
   
   //constructor
   public Squid( int xx, int yy )
   {
      //needs to be first line of code in this constructor
      super(xx,yy);     //invokes constructor of super class
      super.health = squidFiles.length;
      super.filename = super.matDir + squidFiles[0];
      setBody();
   } 
}