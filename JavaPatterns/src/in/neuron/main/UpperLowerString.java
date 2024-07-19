package in.neuron.main;

import java.util.Scanner;

public class UpperLowerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string in lowercase");
		String s1=scan.nextLine();
		
		String s2="";
		/*
		String lowerString=s1.toUpperCase();
		String upperString=s1.toLowerCase();
		System.out.println("Original STring " +s1);
		System.out.println("Lower Case " +lowerString);
		System.out.println("Upper Case " +upperString);
*/
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+(char)(s1.charAt(i)-32);
		}
		System.out.println("Upper String " +s2);
		
		String str1="MANO";
		String str2="";
		
		for(int j=0;j<str1.length();j++)
		{
			str2=str2+(char)(str1.charAt(j)+32);
		}
		System.out.println("Lower String " +str2);
}
}