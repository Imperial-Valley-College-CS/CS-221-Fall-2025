import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;

public class App extends Application
{
   
   Canvas canvas = new Canvas(600, 400);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   
   Group g = new Group(canvas);              //A Group is a Parent
   Scene scene = new Scene(g);         //doesn't have a zero-arg constructor
   KeyHandler handleKey = new KeyHandler();
   Timer timer = new Timer();
   
   double posX = 100;
   double posY = 100;
   double dx = 10;
   double dy = 10;
   
   @Override
   public void start(Stage stage)
   {
      timer.start();
      scene.setOnKeyPressed(handleKey);    //makes keyboard come to life, needs an EventHandler
      stage.setScene(scene);
      stage.show();
   }
   
   public void paintSquare()
   {
      gc.setFill( Color.BLACK );
      gc.fillRect(0,0, 600, 400);
      
      gc.setFill( Color.RED );
      gc.fillRect(posX, posY, 10, 10);
   }
   
   class KeyHandler implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent e)
      {
         String key = e.getCode().toString();
         
         if( key.equals("ESCAPE") )
            System.exit(0);
         else if( key.equals("RIGHT") )
            posX += dx;
         else if( key.equals("LEFT") )
            posX -= dx;         
         else if( key.equals("UP") )
            posY -= dy;       
         else if( key.equals("DOWN") )
            posY += dy;
         
      }
   }//end KeyHandler
   
   class Timer extends AnimationTimer
   {
      long last = 0;
      long dt = 16000000;     //16 millions nanoseconds between frames
      @Override
      public void handle(long now)
      {
         //handle method is invoked on every computational frame
         if( now-last > 1*dt )
         {
            paintSquare();
            last = now;
         }
      }
   }//end Timer
   
}//end App