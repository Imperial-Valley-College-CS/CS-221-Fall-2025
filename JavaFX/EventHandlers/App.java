import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.Scene;
import javafx.scene.Group;

public class App extends Application
{
   Group g = new Group();
   Scene seen = new Scene(g);
   KeyHandler handleKey = new KeyHandler();
   
   @Override
   public void start(Stage sage)
   {
      seen.setOnKeyPressed(handleKey);
      sage.setScene(seen);
      sage.show();
   }
   
   class KeyHandler implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent e)
      {
         System.out.println( e.getText() );
      }
   }
}