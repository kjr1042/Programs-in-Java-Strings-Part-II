package strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1= scan.nextLine().toLowerCase();
		String s2= scan.nextLine().toLowerCase();
		
		String temp1="";
		String temp2="";
		// remove Special Characters.
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				temp1=temp1+ch;
			}
		}
		s1=temp1;
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				temp2=temp2+ch;
			}
		}
		s2=temp2;
		// sort the characters in the strings.
		char ch1[] =s1.toCharArray();
		char ch2[] =s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		String s11 =new String(ch1);
		String s21 =new String(ch2);
		// check the equality of string to satisfy anagram.
		if(s11.equals(s21))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}

	}

}
