package strings;
import java.util.Scanner;

public class substringFrequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1= scan.nextLine();
		String s2 =scan.nextLine();
		int index=0;
		int count=0;
		while((index=s1.indexOf(s2,index))>= 0 )
		{
				count++;
				index =index+s2.length();
		}
		
		System.out.println(count);
		
		

	}

}
