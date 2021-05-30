import java.util.Scanner;
public class Binarycon{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int[] binaryNum = new int[1000];
		int i = 0;
		System.out.println("Enter number:");
		int n=s.nextInt();
        	while (n > 0) 
        	{
           	binaryNum[i] = n % 2;
            	n = n / 2;
            	i++;
       		}
 
        	for (int j = i - 1; j >= 0; j--)
            	System.out.print(binaryNum[j]);
	
}
}