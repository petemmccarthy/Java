import java.util.Scanner;

public class ALittleQuiz
{

  public static void main( String[] args )
  {

    Scanner keyboard = new Scanner(System.in);

    int answer1, answer2, answer3;

    System.out.print( " Are you ready for a quiz? " );

    System.out.println( "Okay, here it comes!" );

    System.out.println( "Q1) What is the capital of Alaska?");
    System.out.println( "1) Melbourne");
    System.out.println( "2) Anchorage");
    System.out.println( "3) Juneau");
    System.out.println( "\n> ");
    answer1 = keyboard.nextInt();

    if ( answer1 == 3 )
    {
      System.out.println( "That's right!" );
    }


    System.out.println( "Q1) Can you store the value \"cat\" in a variable of type int?");
    System.out.println( "1) yes");
    System.out.println( "2) no");
    System.out.println( "\n> ");
    answer2 = keyboard.nextInt();

    System.out.println( "Q1) What is the result of 9+6/3?");
    System.out.println( "1) 5");
    System.out.println( "2) 11");
    System.out.println( "3) 15/3");
    System.out.println( "\n> ");
    answer3 = keyboard.nextInt();

  }
  
}