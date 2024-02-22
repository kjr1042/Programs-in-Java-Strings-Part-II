package strings;

import java.util.Scanner;

public class substringsOfString {

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
				System.out.println(t);
			}
			
		}

	}

}
