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
import java.util.ArrayList;

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
   ArrayList<Block> snake = new ArrayList<>();   
   Block apple;
   
   @Override
   public void start(Stage stage)
   {
      timer.start();                         //handle method in Timer starts being invoked
      initializeSnake();
      updateApple();
      scene.setOnKeyPressed(handleKey);      //makes keyboard come to life, needs an EventHandler
      stage.setScene(scene);      
      stage.show();
   }
   
   public void updateApple()
   {
      double randX = (int)((Constants.CANVAS_WID/Constants.SNAKE_SIZE)*Math.random())*Constants.SNAKE_SIZE;
      double randY = (int)((Constants.CANVAS_HEI/Constants.SNAKE_SIZE)*Math.random())*Constants.SNAKE_SIZE;
      apple = new Block(randX, randY);
      System.out.println( randX + ", " + randY );
   }
   
   public void initializeSnake()
   {
      snake.add( new Block(posX, posY) );
      snake.add( new Block(posX-Constants.SNAKE_SIZE, posY) );
      snake.add( new Block(posX-2*Constants.SNAKE_SIZE, posY) );
   }
   
   public void updateSnake()
   {
      Block head = snake.get(0);
      double newX = head.getX();
      double newY = head.getY();
      switch( key )
      {
         case "UP": newY -= Constants.SNAKE_SIZE; break;
         case "DOWN": newY += Constants.SNAKE_SIZE; break;
         case "LEFT": newX -= Constants.SNAKE_SIZE; break;
         case "RIGHT": newX += Constants.SNAKE_SIZE; break;
      }
      
      if( newY > Constants.CANVAS_HEI )
         System.exit(0);
      
      Block newHead = new Block(newX, newY);
      snake.add(0, newHead);                 //add new head
      
      if( ateApple() )
         updateApple();
      else
         snake.remove( snake.size()-1 );        //remove tail
   }
   
   public boolean ateApple()
   {
      Block head = snake.get(0);
      if( head.getX() == apple.getX() && head.getY() == apple.getY() )
         return true;
      return false;
   }
   
   public void paintSnake()
   {   
      gc.setFill(Constants.BKGR_COLOR);
      gc.fillRect(0, 0, Constants.CANVAS_WID, Constants.CANVAS_HEI);
      
      gc.setFill(Constants.APPLE_COLOR);
      gc.fillRect( apple.getX(), apple.getY(), Constants.SNAKE_SIZE, Constants.SNAKE_SIZE);
      
      
      for( Block b : snake )
      {         
         gc.setFill(b.getColor());
         gc.fillRect(b.getX(), b.getY(), Constants.SNAKE_SIZE, Constants.SNAKE_SIZE);
      }
   }
   
   class Timer extends AnimationTimer
   {
      long last = 0;
      long dt = 16000000;     //16 millions nanoseconds between frames (0.016 seconds)
      @Override
      public void handle(long now)
      {
         //handle method is invoked on every computational frame
         if( now-last > 1*dt )
         {
            updateSnake();
            paintSnake();
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