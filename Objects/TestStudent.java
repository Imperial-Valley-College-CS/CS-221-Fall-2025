public class TestStudent
{
   public static void main(String[] args)
   {
      Student john = new Student("John Cena", "4-23-1977", 73);
      Student britt = new Student("Brittany Wilson", "10-18-1975",64);
      
      int ageJ = john.getAge();
      System.out.println( ageJ );
//       int ageB = britt.getAge();
//       String lastJ = john.getLastName(); 
   }
}