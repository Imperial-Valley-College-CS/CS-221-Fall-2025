import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;

public class AppButton extends Application
{
   Group g = new Group();                    //Group is a Parent
   Button a = new Button(" ");
   Button b = new Button(" ");
   Button c = new Button(" ");
   GridPane pane = new GridPane();       //BorderPane is a Parent
   Scene scene = new Scene(pane);       //doesn't have a zero-arg constructor
   ButtonHandler handleButton = new ButtonHandler();
   boolean circleTurn = false;
   
   @Override
   public void start(Stage stage)
   {
      pane.add( a, 0, 0 );
      pane.add( b, 1, 0 );
      pane.add( c, 2, 0 );
      a.setOnAction(handleButton);    //makes exitBttn come to life, needs an EventHandler
      b.setOnAction(handleButton);    //makes leftBttn come to life, needs an EventHandler
      c.setOnAction(handleButton);    //makes leftBttn come to life, needs an EventHandler
      stage.setScene(scene);
      stage.show();
   }
   
   class ButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent e)
      {
         Button b = (Button)e.getSource();    //getSource returns an Object
         
         if( circleTurn )
         {
            b.setText("O");
            circleTurn = false;
         }else if( !circleTurn )
         {
            b.setText( "X" ); 
            circleTurn = true;
         }
                 
      }
   }
}