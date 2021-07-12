//Create a method with a name(string) and print it in reverse

import java.util.Scanner;
import java.util.*;
public class NameReverse 
{
  static void myMethod() 
  {
    Scanner scan = new Scanner(System.in);
	String name = " ";
    
	System.out.println("Enter a name: "+name);
	name = scan.nextLine();
        // conversion from String object to StringBuffer
    StringBuffer sbr = new StringBuffer(name);
        // To reverse the string
    sbr.reverse();
    System.out.println(" " +sbr); 
  }

  public static void main(String[] args) 
  {
    myMethod();
  }
}
	