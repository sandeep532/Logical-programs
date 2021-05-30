import java.util.Scanner;
public class Monthlypayment{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter P,Y and R values");
		double P=s.nextDouble();
		double Y=s.nextDouble();
		double R=s.nextDouble();
		double n=12*Y;
		double r=R/(12*100);
		double payment=P*r/(1-Math.pow((1+r),(-n)));
		System.out.println("The monthly payment intrest:"+payment);
}
}