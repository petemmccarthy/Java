import java.util.Scanner;

public class TwoMoreQuestions
{

  public static void main( String[] args )

  {

    Scanner keyboard = new Scanner(System.in);

    String ans1, ans2;

    System.out.println( "TWO MORE QUESTIONS, BABY" );

    System.out.println( "\nThink of something and I'll try to guess it!" );

    System.out.print( "\nQuestion 1) Does it belong inside, outside or both? " );
    ans1 = keyboard.next();

    System.out.print( "\nQuestion 2) Is it a living thing? " );
    ans2 = keyboard.next();

    if ( ans1.equals("inside") && ans2.equals("yes") )
    {
      System.out.println( "\nYou must be a plant!");
    }

    else
    {
      System.out.println( "\nYou're a car" );
    }

  }
}