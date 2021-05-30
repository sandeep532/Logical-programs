import java.util.Scanner;
public class Squreroot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter a number");
		double n = sc.nextDouble();
		double x=n;
		double y=1;
		double c=Math.abs(x-y);
		double e=1e-15;
		while(c>e)
 		x=(x+y)/2;
		y=n/x;
		System.out.println("The square root of "+n+"is:"+x);
	}
}