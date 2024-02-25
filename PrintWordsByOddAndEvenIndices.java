package strings;

import java.util.Scanner;

public class PrintWordsByOddAndEvenIndices {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		String arr[] =s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2 !=0)
			{
				System.out.print("Odd indices: "+arr[i] +" ");
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			if(i%2 ==0)
			{
				System.out.print("Even indices: "+arr[i] +" ");
			}
		}

	}

}
