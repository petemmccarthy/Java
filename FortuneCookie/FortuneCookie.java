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
      quote = "run"  
    }

    System.out.println( "Fortune cookie says: " + quote );

  }
}