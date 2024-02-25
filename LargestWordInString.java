package strings;

import java.util.Scanner;

public class LargestWordInString {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s =scan.nextLine();
		String a[] =s.split(" ");
		String largestWord =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()>largestWord.length())
			{
				largestWord =a[i];
			}
		}
		
		System.out.println(largestWord);
	}

}
