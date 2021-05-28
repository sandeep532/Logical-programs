import java.util.Scanner;
public class Reverse{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
int number = sc.nextInt ();
reverse= 0;
while (number != 0)
{
int a= number % 10;
reverse=reverse* 10+a;
number/= 10;
}
System.out.println ("Reversed Number: " +reverse);
}
}