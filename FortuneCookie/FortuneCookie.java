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

    else if ( cookie == 2 )
    {
      quote = "hide";  
    }

    else if ( cookie == 3 )
    {
      quote = "sneak";  
    }

    else if ( cookie == 4 )
    {
      quote = "creep";  
    }

    else if ( cookie == 5 )
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