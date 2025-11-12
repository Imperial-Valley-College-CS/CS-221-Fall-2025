import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.Scene;
import javafx.scene.Group;

public class AppKeyboard extends Application
{
   Group g = new Group();              //A Group is a Parent
   Scene scene = new Scene(g);         //doesn't have a zero-arg constructor
   KeyHandler handleKey = new KeyHandler();
   
   @Override
   public void start(Stage stage)
   {
      scene.setOnKeyPressed(handleKey);    //makes keyboard come to life, needs an EventHandler
      stage.setScene(scene);
      stage.show();
   }
   
   class KeyHandler implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent e)
      {
         String key = e.getCode().toString();
         
         if( key.equals("ESCAPE") )
            System.exit(0);
         
      }
   }
}