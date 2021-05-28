import java.util.Scanner;
public class Fibo{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,firstnum,secnum;
System.out.println("Enter nth value::");
n=s.nextInt();
System.out.println("Enter First Numbeer");
firstnum=s.nextInt();
System.out.println("Enter Second Number");
secnum=s.nextInt();
for(int i=1;i<=n;++i){
int temp=firstnum+secnum;
firstnum=secnum;
secnum=temp;
System.out.println(firstnum);
}
}
}