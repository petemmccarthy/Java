import java.util.Scanner;

public class AgeInFiveYears
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    String name;
    int age;
    
    System.out.print( "Hello. What is your name? ");
    name = keyboard.next();

    System.out.print( "Hi " + name + " How old are you? " );
    age = keyboard.nextInt();

  }
}