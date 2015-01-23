import java.util.Random;

import java.util.Scanner;

public class NumberGuess
{

  public static void main ( String[] args )
  {

    Scanner keyboard = new Scanner(System.in);

    int guess, secret_number = 4;

    System.out.println( "The worst number guessing game ever!" );
    System.out.print( "\nI'm thinking of a number from 1-10, try guess it is? " );
    guess = keyboard.nextInt();

    if ( guess == secret_number )
    {
      System.out.println( "Well done it was " + secret_number );
    }

    else
    {
      System.out.println( "Sorry it was " + secret_number );
    }
    
  }
}