package JavaSessions;

public class ForLoop {

	//To print Uppercase Letters
	public static void printUpperCaseLetters()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
		}
	}
	
	//To print Lowercase Letters
	public static void printLowerCaseLetters()
	{
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println(ch);
		}
	}
	
	//To print Uppercase ASCII
	public static void printASCIIUpperCaseLetters()
	{
		int charASCII=0;
		for(char ch='A';ch<='Z';ch++)
		{
			charASCII=ch;
			System.out.println(ch + " " + charASCII);
		}
	}
	
	//To print LowerCaseASCII
	public static void printASCIILowerCaseLetters()
	{
		int charASCII=0;
		for(char ch='a';ch<='z';ch++)
		{
			charASCII=ch;
			System.out.println(ch + " " + charASCII);
		}
	}
	
	//To print odd and even numbers
	public static void oddAndEvenNumbers()
	{
		for(int i=1;i<=10;i=i+2)
		{
			System.out.println("The odd number is" +i);
		}
		for(int i=0;i<=10;i=i+2)
		{
			System.out.println("The even number is"+ i);
		}
	}
	
	//To print odd and even number with %
	public static void evenAndOddNumbersWithoutIncrement()
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("The even number is " +i);
			}
			else if(i%2==1)
			{
				System.out.println("The odd number is " +i);
			}
		}
	}
	
	public static void printString()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("I am Batman");
		}
	}	

	public static void main(String[] args) {
		//ForLoop.printUpperCaseLetters();
		//ForLoop.printASCIIUpperCaseLetters();
		//ForLoop.printLowerCaseLetters();
		//ForLoop.printASCIILowerCaseLetters();
		//ForLoop.oddNumbers();
		//ForLoop.evenAndOddNumbersWithoutIncrement();
		ForLoop.printString();
	}

}
