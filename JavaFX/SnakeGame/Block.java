import javafx.scene.paint.Color;

public class Block
{
   private double x, y;
   private Color color;
   
   public Block( double x, double y )
   {
      this.x = x;
      this.y = y;
      setColor();
   }
   
   public void setColor()
   {
      int red = (int)(256*Math.random());
      int gre = (int)(256*Math.random());
      int blu = (int)(256*Math.random());
      this.color = Color.rgb(red,gre,blu);
   }
   
   public void setX( double x ){ this.x = x; }
   public void setY( double y ){ this.y = y; }
   public double getX(){ return this.x; }
   public double getY(){ return this.y; }
   public Color getColor(){ return this.color; }
}