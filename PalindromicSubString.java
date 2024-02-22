package strings;

import java.util.Scanner;

public class PalindromicSubString {
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
		
		for(int size=1;size<=input.length();size++)
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
				}
			}
			
		}
	}

}
