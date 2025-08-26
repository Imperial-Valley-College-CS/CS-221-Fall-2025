public class ValidEmail
{
   public static void main(String[] args)
   {
      String name = "Octavio Ortiz";
      String email = "o.ortiz@students.imperial.edu";
      
      char firstI = name.toLowerCase().charAt(0);
      char emailFirstLet = email.toLowerCase().charAt(0);      
      boolean hasFirstI = firstI == emailFirstLet;
      
      int space = name.indexOf(' ');
      String lastName = name.toLowerCase().substring(space+1);
      int dot = email.indexOf('.');
      int at = email.indexOf('@');
      String emailLast = email.toLowerCase().substring(dot+1,at);
      boolean hasLastName = lastName.equals(emailLast);
      
      String domain = "@students.imperial.edu";
      boolean endsWithDomain = email.toLowerCase().endsWith(domain);
      
      boolean validEmail = hasFirstI && hasLastName && endsWithDomain;
   }
}