package strings;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String a[] =s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(reverseOfString(a[i])+" ");;
		}
		
		
	}

	public static String reverseOfString(String s) {
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		return r;
	}

}
