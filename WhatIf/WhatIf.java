public class WhatIf
{
  public static void main( String[] args)
  {
    int people = 20;
    int cats = 30;
    int dogs = 15;

    if ( people < cats )
    {
      System.out.println( "Too many cats! The world is doomed!" );
    }

    if ( people > cats )
    {
      System.out.println( "Not many cats! The world is saved!" ); 
    }

    if ( people < dogs )
    {
      System.out.println( "The world is dooled on!" );
    }

    if ( people > dogs )
    {
      System.out.println( "The world is dry!" );
    }
    
  }
}