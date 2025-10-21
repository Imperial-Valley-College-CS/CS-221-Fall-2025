import java.util.GregorianCalendar;

public class Person
{
   //data fields
   protected String name;
   protected int age, height;
   protected GregorianCalendar dob;
   
   //constructors
   public Person(String nah, String date, int hey)
   {
      this.name = nah;
      this.height = hey;
      setDOB(date);        //handing off date to setDOB method
   }
   
   //methods
   public int getAge()
   {
      calcAge();
      return this.age;
   } 
   
   protected void calcAge()
   {
      GregorianCalendar today = new GregorianCalendar();
      
      long timeDOB = this.dob.getTimeInMillis();
      long timeToday = today.getTimeInMillis();
      long ageMillis = timeToday - timeDOB;
      
      this.age = (int)((double)ageMillis/(1000.0*60*60*24*365.24));
   }   
   
   protected void setDOB(String dab)
   {
      String[] tokens = dab.split("-");
      int month = Integer.parseInt( tokens[0] ) - 1;
      int day = Integer.parseInt( tokens[1] );
      int year = Integer.parseInt( tokens[2] );
      this.dob = new GregorianCalendar( year, month, day );
   }
   
   @Override
   public String toString()
   {
      return "Name: " + this.name + "\nAge: " + getAge();
   }
}