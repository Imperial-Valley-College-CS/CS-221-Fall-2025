import java.util.GregorianCalendar;

public class Student extends Person
{
   //data fields
   private String major;
   private double gpa;
   private char[] grades;
   //constructor(s)
   public Student(String nah, String date, int hei)
   {
      super(nah, date, hei); //invokes super constructor, has to be first line of code
   }
   
   //methods   
   public double getGPA()
   {
      calcGPA();
      return this.gpa;
   }
   
   public void setGrades(char[] g)
   {
      this.grades = g;
   }  
   
   private void calcGPA()
   {
      if( this.grades == null )
         this.gpa = 0;
      else
      {
         double sum = 0;
         for( char x : this.grades )
         {
            switch( x )
            {
               case 'A': case 'a': sum += 4.0; break;
               case 'B': case 'b': sum += 3.0; break;
               case 'C': case 'c': sum += 2.0; break;
               case 'D': case 'd': sum += 1.0; break;
            }
         }
         this.gpa = sum/this.grades.length;
      }
   }
   
   @Override
   public String toString()
   {
      String str = super.toString();
      str += "\nGPA: " + getGPA();
      return str;
   }
}