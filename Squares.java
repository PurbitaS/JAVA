public class Squares
{
	public static void main(String[] args)
	{
		// Step 1 - Declare a reference to an array
		int[] squares; // Could write int squares[];

		// Step 2 - Create the array "object" itself
		squares = new int[5]; // Creates array with 5 slots

		// Step 3 - Initialize slots in the array
		for (int i=0; i < squares.length; i++) 
		{
			squares[i] = i * i;
			System.out.println(squares[i]);
		}
	}
}	