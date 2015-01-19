import java.util.Scanner;

public class TwentyQuestions
{

  public static void main( String[] args )
  {

    Scanner keyboard = new Scanner(System.in);

    String ans1, ans2;

    System.out.println( "TWO QUESTIONS!" );
    System.out.println( "Think of an object, and I'll try to guess it." );

    System.out.println( "Question 1) Is it animal, vegetable or mineral?" );
    System.out.print( ">" );
    ans1 = keyboard.next();

    System.out.println( "Question 1) Is it animal, vegetable or mineral?" );
    System.out.print( ">" );
    ans2 = keyboard.next();

  }
}