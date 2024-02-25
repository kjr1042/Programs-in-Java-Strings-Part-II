package strings;

import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char ch = scan.next().charAt(0);
		int count=0;
		int index=0;
		while((index=s.indexOf(ch,index))>=0)
		{
			count++;
			index++;
		}
		System.out.println(count);
	}

}
