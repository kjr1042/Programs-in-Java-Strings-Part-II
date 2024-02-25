package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallestWordInString {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s =scan.nextLine();
		String a[] =s.split(" ");
		String smallestWord =a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()<smallestWord.length())
			{
				smallestWord =a[i];
			}
		}
		
		System.out.println(smallestWord);
	}

}
