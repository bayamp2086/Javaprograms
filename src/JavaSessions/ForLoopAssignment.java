package JavaSessions;

public class ForLoopAssignment {

	//I am Batman -5times
	public static void printString()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("I am Batman");
		}
	}
	
	//I am Batman -5times
		public static void printStringforMultipleTimes()
		{
			for(int i=1;i<10;i++)
			{
				System.out.println("I am Batman" + " " +i);
			}
		}
		
	//WAP to print 10 to 1 using for, while and do-while loop
		
		public static void printNumbers()
		{
			for(int i=10;i>0;i--)
			{
				System.out.println(i);
			}
			
			int i=10;
			while(i>0)
			{
				System.out.println(i);
				i--;
			}
		}
		
	//Write a program in Java to print "Hello World" ten times using while loop
		
		public static void printStringHelloWorld()
		{
			int i=10;
			while(i>0)
			{
				System.out.println("Hello world");
				i--;
			}
		}
		
	//Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		
		public static void printMultiples()
		{
			int i=1;
			while(i<=10)
			{
				if(i!=7)
				{
					System.out.println(i);
				}
				i++;
			}
		}
		
	//WAP to find out the max number from the given positive numbers
		
		public static void printMaxNumbers()
		{
			int max=0;
			int[] numberArray= {2,9,3,6,13,1};
			for(int i=0;i<numberArray.length;i++)
			{
				
				if(max<numberArray[i])
				{
					max=numberArray[i];
				}
			}
			System.out.println(max);
		}
		
	
	public static void main(String[] args) {
		//ForLoopAssignment.printString();
		//ForLoopAssignment.printStringforMultipleTimes();
		//ForLoopAssignment.printNumbers();
		//ForLoopAssignment.printStringHelloWorld();
		//ForLoopAssignment.printMultiples();
		//ForLoopAssignment.printMaxNumbers();
		

	}

}
