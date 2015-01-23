import java.util.Random;

import java.util.Scanner;

public class Dice
{

  public static void main ( String[] args )
  {

    Scanner keyboard = new Scanner(System.in);

    Random r = new Random();

    int roll1 = 1 + r.nextInt(6);

    int roll1 = 1 + r.nextInt(6);

    System.out.println( "Let's roll the dice!");
    System.out.println( roll1 );
    System.out.println( roll1 );
    System.out.println( "You rolled a total of " + ( roll1 + roll2) "!" );

  }
}