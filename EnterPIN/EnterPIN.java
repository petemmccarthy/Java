import java.util.Scanner;

public class EnterPIN
{

  public static void main ( String[] args )
  {

    Scanner keyboard = new Scanner(System.in);
    int pin = 12345;

    System.out.println("WELCOME TO THE BANK.");
    System.out.print("PLEASE ENTER YOUR PIN: ");
    int entry = keyboard.nextInt();


  }
}