import java.util.Scanner;
public class Perfectnum{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
int sum=0;
for(int i=1;i<=num;i++){
if(num%i==0)
sum=sum+i;

}
if(sum==num){
System.out.println("Yes it is a perfect number");}
else{
System.out.println("No it is not a perfect number");}
}
}