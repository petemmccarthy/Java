import java.util.Random;

import java.util.Scanner;

public class FortuneCookie
{

  public static void main ( String[] args )
  {

    Scanner keyboard = new Scanner(System.in);

    Random r = new Random();

    int cookie = 1 + r.nextInt(6);
    String quote = "";

    if ( cookie == 1 )
    {
      quote = "run"; 
    }

    else if ( cookie == 1 )
    {
      quote = "hide";  
    }

    else if ( cookie == 1 )
    {
      quote = "sneak";  
    }

    else if ( cookie == 1 )
    {
      quote = "creep";  
    }

    else if ( cookie == 1 )
    {
      quote = "scowl";
    }

    else
    {
      quote = "smile";
    }

    System.out.println( "Fortune cookie says: " + quote );

  }
}