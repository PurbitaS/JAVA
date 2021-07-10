import java.util.Arrays;
class StringArray
{
	public static void main(String[] args)
	{
		String[] polar = {"Serine", "Threonine", "Asparagine", "Cysteine", "Glutamine", "Tyrosine"};
		
		String[] nonpolar = {"Alanine", "Valine", "Methionine", "Isoleucine", "Leucine", "Proline", "Phenylalanine", "Tryptophan", "Glycine"};
		
		String[] charged = {"Histidine", "Arginine", "Lysine", "Glutamate", "Aspartate"};
		
		System.out.println("\nNames of Amino Acids: ");
		
		Arrays.sort(polar);
		System.out.println("\nPolar amino acids: ");
		System.out.println(Arrays.toString(polar));
		
		Arrays.sort(nonpolar);
		System.out.println("\nNon-polar amino acids: ");
		System.out.println(Arrays.toString(nonpolar));
		
		Arrays.sort(charged);
		System.out.println("\nElectrically charged amino acids: ");
		System.out.println(Arrays.toString(charged));
	}
}