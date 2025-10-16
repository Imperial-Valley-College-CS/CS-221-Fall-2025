public class TestStudent
{
   public static void main(String[] args)
   {
      Student john = new Student("John Cena", "10-11-1975", 73);
      Student britt = new Student("Brittany Wilson", "10-18-1975",64);
      
      int ageJ = john.getAge();
      System.out.println( ageJ );
      char[] grades = {'A', 'B', 'B', 'a'};     //expected gpa = 3.5
      john.setGrades( grades );
      double gpa = john.getGPA();
      System.out.println( gpa );
      System.out.println( john );
      System.out.println( britt );
   }
}