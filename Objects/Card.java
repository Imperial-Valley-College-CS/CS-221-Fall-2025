import javafx.scene.image.Image;

public class Card
{
   //data fields (static variables and instance variables)
   private String rank, suit, card;
   private int value;
   private Image image;
   //constructors
   public Card(String symbol)
   {
       setCard(symbol);
   }
   //methods
   private void setCard(String simba)
   {
      //set value of rank, suit and card
      int len = simba.length();
      this.rank = simba.toUpperCase().substring(0, len-1); 
      this.suit = simba.toUpperCase().substring(len-1);
      
      switch(this.rank)
      {
         case "10": this.card = "Ten of "; break;
         case "J": this.card = "Jack of "; break;
      }
      
      switch(this.suit)
      {
         case "D": this.card += "Diamonds"; break;
         case "H": this.card += "Hearts"; break;
      }
   }
}