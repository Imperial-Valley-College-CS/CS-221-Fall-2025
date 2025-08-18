public class MyInfo
{
   public static void main(String[] args)
   {
      int myAge;
      String myName = "Octavio Ortiz";
      char myMI = 'H';
      double myGPA = 3.8;
      String myLastName = "Ortiz";
      boolean isOnlyChild = false;
      
      System.out.printf("Name: %s", myName);
      System.out.print("Last Name: " + myLastName);
      System.out.println("Only Child: " + isOnlyChild);
      String str = String.format("GPA: %f%nMiddle Initial: %c",myGPA,myMI);
      System.out.print(str);
   }
}