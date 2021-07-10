import java.util.Scanner;
class Checklength	/*get dna seq from user & find its length; check if they're same*/
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String DNA= " ";
		System.out.println("Enter DNA Sequence: ");
		DNA= scan.nextLine();
		System.out.println("The length of the DNA sequence is: " +DNA.length());
	}
}