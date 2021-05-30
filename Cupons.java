import java.util.Scanner;
public class Cupons
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements 0-10");

for(int i=0; i<n; i++)
{
arr[i]=sc.nextInt();
}
int count=0,zeroCount=0;

while(zeroCount<n)
{
count++;
int random = (int)(Math.random()*100)%11;
for(int i=0; i<n; i++)
{
if(arr[i]==random)
{
arr[i]=100;
zeroCount++;
}
}
System.out.println("Random number : "+random);
}
System.out.println("Total random numbers needed are "+count);
}
}