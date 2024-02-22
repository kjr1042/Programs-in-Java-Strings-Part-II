package strings;

import java.util.Scanner;

public class LargestPalindromicString {
	static boolean isPalindrome(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input =scan.nextLine();
		
		for(int size=input.length()-1;size>=0;size--)
		{
			
			for(int i=0;i<=input.length()-size;i++)
			{
				String t="";
				for(int j=i;j<i+size;j++)
				{
					t=t+input.charAt(j);
					
				}
				if(isPalindrome(t))
				{
					System.out.println(t);
					return;  // return statement exists from the if block after printing the first palindrome,and pass control to the main method.
				}
			}
			
		}
	}

}
