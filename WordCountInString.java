package strings;

import java.util.Scanner;

public class WordCountInString {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s =scan.nextLine();
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1) != ' ')
			{
				count++;
			}
		}
		//System.out.println(count+1);
		System.out.println(s.charAt(0)==' ' ? count :count+1);

	}

}
