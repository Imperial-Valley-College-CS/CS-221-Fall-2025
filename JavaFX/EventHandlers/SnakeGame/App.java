import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class App extends Application
{
   Canvas canvas = new Canvas(Constants.CANVAS_WID, Constants.CANVAS_HEI);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   
   Group g = new Group(canvas);           //A Group is a Parent
   Scene scene = new Scene(g);       //doesn't have a zero-arg constructor
   Timer timer = new Timer();
   double posX = 100;
   double posY = 100;
   
   
   @Override
   public void start(Stage stage)
   {
      timer.start();             //handle method starts being invoked
      stage.setScene(scene);      
      stage.show();
   }
   
   public void moveSquare()
   {   
      gc.setFill(Constants.BKGR_COLOR);
      gc.fillRect(0, 0, Constants.CANVAS_WID, Constants.CANVAS_HEI);
      
      gc.setFill(Constants.SNAKE_COLOR);
      gc.fillRect(posX, posY, Constants.SNAKE_SIZE, Constants.SNAKE_SIZE);
   }
   
   class Timer extends AnimationTimer
   {
      @Override
      public void handle(long now)
      {
         //handle method is invoked on every computational frame
         posX += 1;
         moveSquare();
      }
   }
}