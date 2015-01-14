import java.util.Scanner;

public class SpaceBoxing
{

  public static String planet_name( int planet )
  {

    int result = ;

    if ( planet == 1 )
    {
      result = 0.78;
    }

    else if ( planet == 2 )
    {
      result = 0.39;
    }

    else if ( planet == 3 )
    {
      result = 2.65;
    }

    else if ( planet == 4 )
    {
      result = 1.17;
    }

    else if ( planet == 5 )
    {
      result = 1.05;
    }

    else ( planet == 6 )
    {
      result = 1.23;
    }

    return result;

  }

  public static void main( String[] args )
  {

    Scanner keyboard = new Scanner(System.in);

    int weight, planet;

    System.out.println( "Please enter your current earth weight: ");
    weight = keyboard.nextInt();

    System.out.println( "I have information for the following planets:");
    
    System.out.println( "1. Venus");
    System.out.println( "2. Mars");
    System.out.println( "3. Jupiter");
    System.out.println( "4. Saturn");
    System.out.println( "5. Uranus");
    System.out.println( "6. Neptune");

    System.out.println("\nWhich planet are you visiting? ");
    planet = keyboard.nextInt();

    System.out.println( "Your weight would be " + ( weight * result ) + " pounds on that planet" );

  }
}




