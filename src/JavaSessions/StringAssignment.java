package JavaSessions;

public class StringAssignment {
	
	//Reverse the string
	//input:Selenium reverse output:muineleS
	public static void strReverse(String input)
	{
		System.out.println("Hello");
		char[] ch=input.toCharArray();
		int start=0;
		int end=input.length()-1;
		char temp;
		while(start<=end)
		{
			temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
		String reverse=new String(ch);
		System.out.println(reverse);
		
	}
	
	//Reverse array of Strings
	//input:I am a funny person output:person funny a am I
	public static void reverseStringArray(String input)
	{
		String[] word=input.split(" ");
		int start=0;
		int end=word.length-1;
		String temp;
		while(start<=end)
		{
			temp=word[start];
			word[start]=word[end];
			word[end]=temp;
			start++;
			end--;
		}
		String reverse=String.join(" ", word);
		System.out.println(reverse);
	}
	
	//input:I am a funny person output:nosrep ynnuf a ma I
	public static void revString(String input)
	{
		String[] word=input.split(" ");
		int start=0;
		int end=word.length-1;
		String temp,rev="";
		while(start<=end)
		{
			temp=word[start];
			word[start]=word[end];
			word[end]=temp;
			char[] tc=word[start].toCharArray();
			int s=0;
			int e=tc.length-1;
			char t;
			while(s<=e)
			{
				t=tc[s];
				tc[s]=tc[e];
				tc[e]=t;
				s++;
				e--;
			}rev=new String(tc);
			start++;
			end--;
		}System.out.println(String.join(" ", rev));
	}
	
	
	public static void main(String[] args) {
		StringAssignment.strReverse("Selenium");
		StringAssignment.reverseStringArray("I am a funny person");
		StringAssignment.revString("I am a funny person");
	}

}
