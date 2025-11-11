import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.image.Image;

public class App extends Application
{
   Canvas canvas = new Canvas(Constants.CANVAS_WID, Constants.CANVAS_HEI);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   
   KeyHandler handleKey = new KeyHandler();
   
   Group g = new Group(canvas);           //A Group is a Parent
   Scene scene = new Scene(g);       //doesn't have a zero-arg constructor
   Timer timer = new Timer();
   double posX = 100;
   double posY = 100;
   String key = "";
   
   
   @Override
   public void start(Stage stage)
   {
      timer.start();             //handle method starts being invoked
      scene.setOnKeyPressed(handleKey);    //makes keyboard come to life, needs an EventHandler
      stage.setScene(scene);      
      stage.show();
   }
   
   public void direction()
   {
      switch( key )
      {
         case "UP": posY -= Constants.SNAKE_SIZE; break;
         case "DOWN": posY += Constants.SNAKE_SIZE; break;
         case "LEFT": posX -= Constants.SNAKE_SIZE; break;
         case "RIGHT": posX += Constants.SNAKE_SIZE; break;
      }
      
      if( posX > Constants.CANVAS_WID )
         posX = 0;
      if( posY > Constants.CANVAS_HEI )
         posY = 0;
      if( posX < 0 )
         posX = Constants.CANVAS_WID;
      if( posY < 0 )
         posY = Constants.CANVAS_HEI;
   }
   
   public void moveSquare()
   {   
      gc.setFill(Constants.BKGR_COLOR);
      gc.fillRect(0, 0, Constants.CANVAS_WID, Constants.CANVAS_HEI);
      
      gc.setFill(Constants.SNAKE_COLOR);
      gc.drawImage(Constants.pikachu, posX, posY, Constants.SNAKE_SIZE, Constants.SNAKE_SIZE);
      //gc.fillRect(posX, posY, Constants.SNAKE_SIZE, Constants.SNAKE_SIZE);
   }
   
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
            direction();
            moveSquare();
            last = now;
         }
      }
   }
   
   class KeyHandler implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent e)
      {
         switch( e.getCode().toString() )
         {
            case "UP":
            case "DOWN":
            case "LEFT":
            case "RIGHT":
               key = e.getCode().toString();
         }
         
         if( key.equals("ESCAPE") )
            System.exit(0);  
         
      }
   }
}