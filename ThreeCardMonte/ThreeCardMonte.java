import java.util.Random;

import java.util.Scanner;

public class ThreeCardMonte
{

  public static void main ( String[] args )
  {

    Scanner keyboard = new Scanner(System.in);

    Random r = new Random();

    int ace = 1 + r.nextInt(3);
    int guess;

    System.out.println( "You slide up to Fast Eddie's card table and plop down your cash." );
    System.out.println( "He glances at you out of the corner of his eye and starts shuffling." );
    System.out.println( "He lays down three cards." );
    System.out.println( "\nWhich card is the ace, 1, 2 or 3? " );
    guess = keyboard.nextInt();

    if ( guess == ace )
    {
      System.out.println( "Ha! Fast Eddie wins again! The ace was card number " + ace + "." );  
    }

    else
    {
      System.out.println( "You nailed it! Fast Eddie reluctantly hands over your winnings, scowling." );
    }

  }
}