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
       setValue();
   }
   
   public Card(String symbol, int val)
   {
       setCard(symbol);
       this.value = val;
   }
   
   //methods
   public int getValue()
   {
      return this.value;
   }
   
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
   
   private void setValue()
   {
      switch( this.rank )
      {
         case "2": this.value = 2; break;
         case "3": this.value = 3; break;
         case "10": this.value = 10; break;
      }
   }
   
   public void aceUP()
   {
      this.value = 11;
   }
   
   public void aceDOWN()
   {
      this.value = 1;
   }
   
   public int compareTo(Card cardX)
   {
      return this.value - cardX.getValue();
   }
   
   public String toString()
   {
      return "Card: " + this.card + "\n" + "Value: " + this.value;
   }
}