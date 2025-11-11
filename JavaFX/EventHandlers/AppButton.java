import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;

public class AppButton extends Application
{
   Group g = new Group();                    //Group is a Parent
   Button leftBttn = new Button("LEFT");
   Button exitBttn = new Button("Exit");
   BorderPane pane = new BorderPane();       //BorderPane is a Parent
   Scene scene = new Scene(pane);       //doesn't have a zero-arg constructor
   ButtonHandler handleButton = new ButtonHandler();
   
   @Override
   public void start(Stage stage)
   {
      pane.setCenter( exitBttn );
      pane.setLeft( leftBttn );
      exitBttn.setOnAction(handleButton);    //makes exitBttn come to life, needs an EventHandler
      leftBttn.setOnAction(handleButton);    //makes leftBttn come to life, needs an EventHandler
      stage.setScene(scene);
      stage.show();
   }
   
   class ButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent e)
      {
         Button b = (Button)e.getSource();    //getSource returns an Object
         
         if( b.getText().equals("Exit") )
            System.exit(0);
         else if( b.getText().equals("LEFT") )
            scene.setRoot(g); 
                 
      }
   }
}