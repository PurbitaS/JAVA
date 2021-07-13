import java.util.Scanner;
class Checklength	/*get dna seq from user & find its length; check if they're same*/
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String DNAa= " ";
		String DNAb= " ";
		System.out.println(" ");
		System.out.println("Enter DNA Sequence: ");
		DNAa= scan.nextLine();
		System.out.println("The length of the DNA sequence is: " +DNAa.length());
		
		System.out.println(" ");
		
		System.out.println("Enter DNA Sequence: ");
		DNAb= scan.nextLine();
		System.out.println("The length of the DNA sequence is: " +DNAb.length());
		System.out.println(" ");
		if(DNAa.equals(DNAb))
		{
			System.out.println(DNAa.equals(DNAb)+ "\nThe two sequences are same");
		}
		else{
			System.out.println(DNAa.equals(DNAb)+ "\nThe two sequences are not same" );
		}
		
	}
}
