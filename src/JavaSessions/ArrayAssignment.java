package JavaSessions;

import java.util.Arrays;
import java.util.List;

public class ArrayAssignment {
	
	//Question 3: Try to print the following pattern on the console:
	//n = 4
	//n = 3
	//n = 2
	//n = 1
	//n = 0
	
	public static void printArrayElements()
	{
		short[] input=new short[5];
		for(int i=input.length-1;i>=0;i--)
		{
			System.out.println(i);
		}
	}
	

	//Question 2: Write a program to create a static Array, having following cricket dat﻿a:
	//--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), 
	//isActive(boolean)
	//--Try to create multiple Object Arrays for different players 
	//--Try to print all the values of each player on the console using normal for/while loop and for each loop
	
	public static void printObjectArrayElements()
	{
		Object[] cricketData=new Object[7];
		cricketData[0]="Harshini";
		cricketData[1]=28;
		cricketData[2]="RCB";
		cricketData[3]="01.01.1998";
		cricketData[4]='F';
		cricketData[5]=25.5;
		cricketData[6]=true;
		
		Object[] cricketData1=new Object[7];
		cricketData1[0]="Divya";
		cricketData1[1]=22;
		cricketData1[2]="CSK";
		cricketData1[3]="02.02.1998";
		cricketData1[4]='F';
		cricketData1[5]=32.5;
		cricketData1[6]=true;

		
		for(Object e:cricketData)
		{
			//System.out.println(e);
		}
	
		for(int i=0;i<cricketData.length;i++)
		{
			System.out.println(cricketData[i]);
		}
		
		for(int i=0;i<cricketData1.length;i++)
		{
			System.out.println(cricketData1[i]);
		}
	}
		
		/*Question 1: Write a program to print the following pattern using for loop:


		                        00 01 02 03 04 05 06 07 08 09 
		                        10 11 12 13 14 15 16 17 18 19 
		                        20 21 22 23 24 25 26 27 28 29 
		                        30 31 32 33 34 35 36 37 38 39
		*/
		
		public static void patternPgm()
		{
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<=9;j++)
				{
					System.out.print(i +"" +j + "\t");
				}
				System.out.println();
			}
		}
		
		//Duplicates in an array
		//[10,3,4,3,4]
		
		public static void duplicatesInArray()
		{
			int[] input= {10,3,4,3,4,10,1,7,9};
			for(int i=0;i<input.length-1;i++)
			{
				for(int j=i+1;j<input.length;j++)
				{
					if(input[i]==input[j])
					{
						System.out.println(input[i]);
					}
				}
				
			}
		}
		
		//remove duplicates in an array
		public static void removeDuplicates()
		{
			int[] input={10,3,4,3,4,10,1,7,9};
			int[] temp=new int[input.length];
			//temp[0]=input[0];
			int k=0;
			for(int i=0;i<input.length-1;i++)
			{
				for(int j=i+1;j<input.length;j++)
				{
					if(input[i]!=input[j])
					{
						temp[k]=input[i];
						k++;
					}
				}
					
			}
			
			for(int i=0;i<temp.length;i++)
			{
				System.out.println(temp[i]);
			}
			
			List<Integer> data=Arrays.asList(10,20,30);
			
		}
	

	public static void main(String[] args) {
		//ArrayAssignment.printArrayElements();
		//ArrayAssignment.printObjectArrayElements();
		//ArrayAssignment.patternPgm();
		//ArrayAssignment.duplicatesInArray();
		ArrayAssignment.removeDuplicates();
	}

}
