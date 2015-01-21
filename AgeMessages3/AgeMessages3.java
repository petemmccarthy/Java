import.java.util.Scanner;

public class AgeMessages3
{

  public static void main( String[] args )
  {

    Scanner keyboard = new Scanner(System.in);

    String name;
    int age;

    System.out.print( "Your name: " );
    name = keyboard.next();

    System.out.print( "Your age: " );
    age = keyboard.nextInt();

    if ( age < 16 );
    {
      System.out.println( "You can't drive, " + name + "." );
    }

    if ( age > 15 && age < 18 )
    {
      System.out.println( "You can drive but not vote, " + name + "." );
    } 


  }
}