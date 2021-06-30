import java.util.Scanner;  
public class Name
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);			//creating Scanner class object
		String name= " ";
		System.out.println("Write your name here: ");
        name = scan.nextLine();
	
		for(int i=0; i<15; i++)
		{
			System.out.println(name+ " ");
		}
	}
}