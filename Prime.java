import java.util.Scanner;
public class Prime{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
if(num==0||num==1){
System.out.println(num+"is not a prime");

}
else{
for(int i=2;i<=num/2;i++){
if(num%i==0){
System.out.println(num+"is not a prime");
break;
}
else
{
System.out.println(num+"is a prime");}}
}}}