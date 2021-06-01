class Percent
{
	public static void main(String[] args)
	{
		int sub1=52, sub2=60, sub3=49, sub4=70, sub5=65;
		System.out.println("Individual marks in 5 subjects are: \n sub1=52, sub2=60, sub3=49, sub4=70, sub5=65");
		int marks= sub1+ sub2+ sub3+ sub4+ sub5;
		System.out.println("The total marks in 5 subjects is: " +marks);
		float percent= ((float)marks/500)*100;
		System.out.println("The percentage of marks in 5 subject is: " +percent);
	}
}
	