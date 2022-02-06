import java.util.Scanner;
/**
* Will add two ints for user.
* 1) Define vars
* 2) Message to user
* 3) Create a Scanner object
* 4) Use Scanner object to get two integers from the user
* 5) Output message and result
*
* @author Cesar Melero, melero.jr.231@gmail.com
* @version a version number or a date (ex. v1.0)
* @since last date of update (2022-2-4)
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