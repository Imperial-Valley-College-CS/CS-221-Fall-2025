import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Scene;
import javafx.scene.Group;

public class AppMouse extends Application
{
   Group g = new Group();           //A Group is a Parent
   Scene seen = new Scene(g);       //doesn't have a zero-arg constructor
   MouseHandler handleMouse = new MouseHandler();
   
   @Override
   public void start(Stage sage)
   {
      seen.setOnMouseClicked(handleMouse);    //makes mouse come to life, needs an EventHandler
      sage.setScene(seen);
      sage.show();
   }
   
   class MouseHandler implements EventHandler<MouseEvent>
   {
      @Override
      public void handle(MouseEvent e)
      {
         double x = e.getX();
         double y = e.getY();
         
         System.out.println( x + ", " + y);
         
         if( x > 200 && y > 200 )
            System.exit(0);         
      }
   }
}