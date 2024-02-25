package strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s =scan.nextLine();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		String t="";
		for(char ch:set)
		{
			t=t+ch;
		}
		System.out.println(t);
	}

}
