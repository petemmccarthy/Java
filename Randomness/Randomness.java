import java.util.Random;

public class Randomness
{

  public static void main ( String[] args )
  {

    Random r = new Random();

    int x = 1 + r.nextInt(10);

    System.out.println( "My random number is " + x );
    
  }
}