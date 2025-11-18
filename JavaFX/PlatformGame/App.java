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
import java.util.Arrays;

public class App extends Application
{
   
   Canvas canvas = new Canvas(600, 400);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   
   Group g = new Group(canvas);              //A Group is a Parent
   Scene scene = new Scene(g);         //doesn't have a zero-arg constructor
   KeyPressedHandler pressKey = new KeyPressedHandler();
   KeyReleasedHandler releaseKey = new KeyReleasedHandler();
   Timer timer = new Timer();
   
   String[] keys = new String[10];
   String key = "NULL";
   boolean keyPressed = false;
   
   double posX = 100;
   double posY = 100;
   double velX = 0;
   double velY = 0;
   double maxVelX = 30;
   double delta_velX = 2;
   
   @Override
   public void start(Stage stage)
   {
      timer.start();
      initializeKeys();
      scene.setOnKeyPressed(pressKey);    //makes keyboard come to life, needs an EventHandler
      scene.setOnKeyReleased(releaseKey);    //makes keyboard come to life, needs an EventHandler
      stage.setScene(scene);
      stage.show();
   }
   
   public void initializeKeys()
   {
      for( int i = 0; i < keys.length; i++ )
         keys[i] = "NULL";
   }
   
   public void updateKeys()
   {
      for( int i = keys.length-1; i > 0; i-- )
         keys[i] = keys[i-1];
         
      if( keyPressed )
         keys[0] = key;
      else
         keys[0] = "NULL";
      
      //System.out.println( Arrays.toString(keys) );
   }
   
   public void updateSpeed()
   {
      int i = 1;
      if( keys[0].equals("RIGHT") )
      {
         while( i < keys.length && keys[i++].equals("RIGHT") )
         {
            velX+=delta_velX;
         }
      }else if( keys[0].equals("LEFT") )
      {
         while( i < keys.length && keys[i++].equals("LEFT") )
         {
            velX-=delta_velX;
         }
      }else if( keys[0].equals("NULL") )
      {
         while( i < keys.length && keys[i++].equals("NULL"))
         {
            if( velX > 0 ){
               velX -= delta_velX;
               if( velX <= 0 )
                  velX = 0;
            }else if( velX < 0 ){
               velX += delta_velX;
               if( velX >= 0 )
                  velX = 0;
            }
         }
      }
      
      if( velX >= maxVelX )
         velX = maxVelX;
         
      if( velX <= -1*maxVelX )
         velX = -1*maxVelX;
     
   }
   
   public void updatePosition()
   {
      posX += velX;
   }
   
   public void paintSquare()
   {
      gc.setFill( Color.BLACK );
      gc.fillRect(0,0, 600, 400);
      
      gc.setFill( Color.RED );
      gc.fillRect(posX, posY, 10, 10);
   }
   
   class KeyPressedHandler implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent e)      //only invoked when there's a KeyEvent
      {
         String localKey = e.getCode().toString();
         
         if( localKey.equals("ESCAPE") )
            System.exit(0);
         
         switch( localKey )
         {
            case "LEFT":
            case "RIGHT":
               key = localKey;               
               keyPressed = true;
         }
         //System.out.println( localKey + ", " + key );
      }
   }//end KeyPressedHandler
   
   class KeyReleasedHandler implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent e)      //only invoked when there's a KeyEvent
      {
         keyPressed = false;
      }
   }//end KeyPressedHandler

   
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
            updateKeys();
            updateSpeed();
            updatePosition();
            paintSquare();
            last = now;
         }
      }
   }//end Timer
   
}//end App