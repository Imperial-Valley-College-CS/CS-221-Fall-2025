import javafx.scene.image.Image;

public class Card
{
   //data fields (static or instance variables)
   private String rank, suit, card;
   private int value;
   private Image image;
   //constructors
   public Card(String symbol)
   {
      setCard(symbol);
      setValue();
   }
   //methods
   private void setCard(String s)
   {
      //initializes rank, suit and card
      int len = s.length();
      this.rank = s.substring(0,len-1);
      this.suit = s.substring(len-1);
      
      switch( this.rank )
      {
         case "2": this.card = "Two of "; break;
         case "3": this.card = "Three of "; break;
         case "10": this.card = "Ten of "; break;
      }
      switch( this.suit )
      {
         case "D": this.card += "Diamonds"; break;
      }
   }
   private void setValue()
   {
      //initialize value
   }
}