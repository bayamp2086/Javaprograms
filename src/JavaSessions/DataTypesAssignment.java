package JavaSessions;

public class DataTypesAssignment {
	
	//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
			//Expected Output :
				//Hello 
				//Naveen K
		
			public static void printHello()
			{
				String name="Divya S";
				System.out.println("Hello");
				System.out.println(name);
			}
			
	//2. Write a Java program to print the sum of two numbers. 
			//Test Data: 
			//74 + 36 
			//Expected Output :
			//110
			
			public static void sumOfNumbers()
			{
				int a=74;
				int b=36;
				System.out.println(a+b);
			}
			
	//3. Write a Java program to divide two numbers and print on the screen. 
			//Test Data : 
			//50/3
			//Expected Output :
			//16
			
			public static void divideNumbers()
			{
				int a=50;
				int b=3;
				System.out.println(a/b);
			}
			
	//4. Write a Java program to print the result of the following operations. Change your test data accordingly.
			//Test Data:
				//a. -5 + 8 * 6
				//b. (55+9) % 9 
				//c. 20 + -3*5 / 8 
				//d. 5 + 15 / 3 * 2 - 8 % 3 
				//Expected Output :
				//43 
				//1 
				//19 
				//13
			
			public static void printOperations()
			{
				System.out.println(-5+8*6);
				System.out.println((55+9)%9);
				System.out.println(20+ -3*5 /8);
				System.out.println(5+15 / 3*2 - 8%3);
			}
			
		//5. Write a Java program to compute the specified expressions and print the output. Go to the editor
			//Test Data:
				//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
				//Expected Output
				//2.138888888888889
			public static void printData()
			{
				System.out.println((25.5 * 3.5 -3.5 * 3.5)/(40.5 - 4.5));
			}
			
		//6.Try to concat "Hello Selenium" with a character 't'.
			public static void stringConcatenation()
			{
				String s="Hello Selenium";
				char c='t';
				String text=s + " " +c;
				System.out.println(text);
			}
			
		//7.Create three int variables having values like : 100, 200, 3400. Add them and 
			//concatenate and generate this output String : 
			//"Your Total amount is. 3700".
			
			public static void stringPrintData()
			{
				int a=100;
				int b=200;
				int c=3400;
				int total=a+b+c;
				String text="Your Total amount is.";
				System.out.println(text + " " +total);
			}
			
		//8. What should be the output for :
			//byte b3 = 065; 
			//System.out.println(b3);
			
			public static void byteData()
			{
				byte b=065;
				System.out.println(b);
			}
			
		//1. Take three numbers from the user and print the greatest number. 
				//Test Data
				//Input the 1st number: 25 
				//Input the 2nd number: 78 
				//Input the 3rd number: 87
				//Expected Output 
				//The greatest: 87
			
			public static void greaterNumber()
			{
				int a=25;
				int b=78;
				int c=87;
				if(a>b & a>c)
				{
					System.out.println("The greatest no is" +a);
				}
				else if(b>a & b>c)
				{
					System.out.println("The greatest no is" +b);
				}
				else
				{
					System.out.println("The greatest no is" +c);
				}
			}
			
		//2. Write a Java program to test a number is positive or negative.
			//Test Data
			//Input number: 35 -- positive number
			//Input number: -11 -- negative number
			
			public static void positiveOrNegativeNumber()
			{
				int a = 35;
				int b = -11;
				if (a>0)
				{
					System.out.println("Positive Number" +a);
				}
				else
				{
					System.out.println("Negative Number" +a);
				}
				
				if (b>0)
				{
					System.out.println("Positive Number" +b);
				}
				else
				{
					System.out.println("Negative Number" +b);
				}
			
			}

	public static void main(String[] args) {
		
		//DataTypesAssignment.printHello();
		//DataTypesAssignment.sumOfNumbers();
		//DataTypesAssignment.divideNumbers();
		//DataTypesAssignment.printOperations();
		//DataTypesAssignment.printData();
		//DataTypesAssignment.stringConcatenation();
		//DataTypesAssignment.stringPrintData();
		//DataTypesAssignment.byteData();
		//DataTypesAssignment.greaterNumber();
		DataTypesAssignment.positiveOrNegativeNumber();
	}

}
