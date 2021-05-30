import java.util.Scanner;
public class TemperatureConversion{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1 or 2");
		System.out.println("(1)Celsius to Fahrenheit:");
		System.out.println("(2)Fahrenheit to Celsius:");
		int a=s.nextInt();
		System.out.println("Enter Degrees to convert");
		double num=s.nextDouble();
		double result;
		switch(a){
			case 1:
				result=(num*9/5)+32;
				System.out.println("Celsius to Fahrenheit:"+result);
				break;	
			case 2:
				result=(num-32)*5/9;
				System.out.println("Fahrenheit to Celsius:"+result);
				break;	
			default:
				System.out.println("Enter 1 or 2");	
		}
	}
}