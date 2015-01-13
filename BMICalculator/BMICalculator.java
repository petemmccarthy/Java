import java.util.Scanner;

public class BMICalculator

{
    public static void main ( String[] args )
    {

      Scanner keyboard = new Scanner(System.in);

      double height, weight;

      System.out.print( "What is your height in metres? " );
      height = keyboard.nextDouble();

      System.out.print( "What is your weight in kg? " );
      weight = keyboard.nextDouble();

      System.out.println( "Your height in metres: " + height );
      System.out.println( "Your weight in kg: " + weight );
      System.out.println();
      System.out.println( "Your BMI is " + ( weight / ( height * height )));

    }
}