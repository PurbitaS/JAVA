import java.util.Scanner;  
public class EvenOdd  
{  
	public static void main (String[] args)  
	{       
		Scanner scan = new Scanner(System.in);  		//creating Scanner class object
		System.out.print("Enter the number: ");  
		int num=scan.nextInt();  						//reading value from user  
		findEvenOdd(num);  								//method calling  
	}  
	public static void findEvenOdd(int num)  			//user defined method  
	{  
		if(num%2==0)   					000				//method body  
		System.out.println(num+" is even");   
		else   
		System.out.println(num+" is odd");  
	}  
}  