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

  public atatic void main( String[] args )
  {

    Scanner keyboard = new Scanner(System.in);

    int weight;

    System.out.println( "Please enter your current earth weight: ");
    weight = keyboard.next();


  }
}