package strings;

import java.util.Scanner;

public class CheckString1CharctersPresentinString2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 =scan.nextLine();
		String s2 =scan.nextLine();
		int count=0;
		for(int i=0;i<s2.length();i++)
		{
			char ch = s2.charAt(i);
			if(s1.indexOf(ch)>=0)
			{
				count++;
				
			}
			else
			{
				break;
			}
		}
		if(s2.length()==count)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
