import java.util.Scanner;

public class ATMMachine1 {
public static void main (String [] args) 
{
//Scanner
Scanner reader = new Scanner(System.in);
System.out.print (" Withdraw Money:"); 
String money = reader.nextLine();
System.out.println("ATMMachine1"+ money);
System.out.print (" Statement:");
String Statement =reader.nextLine(); 
System.out.println("ATMMachine1"+ Statement);
System.out.print (" Deposit:");
String Deposit = reader.nextLine(); 
System.out.println("ATMMachine1"+ Deposit);
System.out.println ( " Withdraw \n \n Money");
System.out.println ( " Withdraw \t\t Money");
System.out.println ( " Withdraw \n \t Money");
System.out.println ( " \"Withdraw Money \"");
}
}
