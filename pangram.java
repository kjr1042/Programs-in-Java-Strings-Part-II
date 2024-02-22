package strings;

import java.util.Scanner;

public class pangram {

	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		Scanner scan = new Scanner(System.in);
		String input=scan.nextLine().toLowerCase();


		int count=0;
		for(int i=0;i<s.length();i++) 
		{
			char ch = s.charAt(i);
			if(input.indexOf(ch)>=0)
			{
				count++;
			}
			else
			{
				break;
			}
		}
		if(count==26)
		{
			System.out.println("Given string is Pangram");
		}
		else
		{
			System.out.println("Given string is not a Pangram");
		}

	}

}
