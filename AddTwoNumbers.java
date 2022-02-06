import java.util.Scanner;
/**
* class AddTwoNumbers will add two numbers.
* @author Cesar Melero, melero.jr.231@gmail.com
* @version (v1.0)
* @since 2022-2-4
*/
public class AddTwoNumbers
{
public static void main (String [] args)
{
//input varaibles
int n1, n2;
System.out.println ("Hello out there.");
System.out.println ("I will add two numbers for you.");
System.out.println ("Enter two whole numbers on a line:");
//Gets input from user
Scanner keyboard = new Scanner (System.in);
n1 = keyboard.nextInt ();
n2 = keyboard.nextInt ();
System.out.println ("The sum of those two numbers is: ");
System.out.println (n1 + n2);
}
}
