import java.util.GregorianCalendar;

public class Student
{
   //data fields
   private String name, major;
   private GregorianCalendar dob;
   private int age, height;
   private double gpa;
   private char[] grades;
   //constructor(s)
   public Student(String nah, String date, int hei)
   {
      this.name = nah;
      this.height = hei;
      setDOB(date);        //handing off date to setDOB method
   }
   //methods
   public int getAge()
   {
      calcAge();
      return this.age;
   } 
   
   public double getGPA()
   {
      calcGPA();
      return this.gpa;
   }
   
   public void setGrades(char[] g)
   {
      this.grades = g;
   }  
   
   private void setDOB(String dab)
   {
      String[] tokens = dab.split("-");
      int month = Integer.parseInt( tokens[0] ) - 1;
      int day = Integer.parseInt( tokens[1] );
      int year = Integer.parseInt( tokens[2] );
      this.dob = new GregorianCalendar( year, month, day );
   }
   
   private void calcAge()
   {
      GregorianCalendar today = new GregorianCalendar();
      
      long timeDOB = this.dob.getTimeInMillis();
      long timeToday = today.getTimeInMillis();
      long ageMillis = timeToday - timeDOB;
      
      this.age = (int)((double)ageMillis/(1000.0*60*60*24*365.24));
   }
   
   private void calcGPA()
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