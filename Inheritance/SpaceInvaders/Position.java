public class Position
{
   //data fields
   private int x, y;
   //constructor
   public Position( int xx, int yy )
   {
      this.x = xx;
      this.y = yy;
   }
   //methods
   public int getX()
   {
      return this.x;
   }
   
   public int getY()
   {
      return this.y;
   }
   
   public void setX( int xx )
   {
      this.x = xx;
   }
   
   public void setY( int yy )
   {
      this.y = yy;
   }
}