import java.util.Random;

import java.util.Scanner;

public class OneShotHiLo
{

  public static void main ( String[] args )
  {

    Scanner keyboard = new Scanner(System.in);

    Random r = new Random();

    int randy_num = 1 + r.nextInt(100);
    int guess;

    System.out.print( "I'm thinking of a numnber between 1-100. Try and guess it: ");
    guess= keyboard.nextInt();

    if ( guess == randy_num )
    {
      System.out.println( "Dead right! It was " + randy_num + "!");  
    }

    else if ( guess > randy_num )
    {
      System.out.println( "Sorry you were too high, it was " + randy_num );  
    }

    else
    {
      System.out.println( "Sorry you were too low, it was " + randy_num );  
    }

  }
}