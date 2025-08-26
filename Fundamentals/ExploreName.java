import java.util.Scanner;

public class ExploreName
{
   public static void main(String[] args)
   {
      //Create scanner object
      Scanner scan = new Scanner(System.in);
      
      //Prompt the user for their name & create a variable
      System.out.print("Enter your name: " );
      String name = scan.nextLine();
      
      int index = name.indexOf(' ');      //position of the space between first name and last name
      
      String firstName = name.substring(0,index);  //grabs first name
      String lastName = name.substring(index+1);   //grabs last name
      
      char firstInitial = firstName.charAt(0);
      
      int firstNameLen = firstName.length();
      
      System.out.println( firstName );     
   }
}