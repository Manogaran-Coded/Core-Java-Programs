package in.neuron.main;

import java.util.Arrays;

public class LaunchAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="a gentle man";
		String s2="elegant man";
		String str1=s1.replace(" ", "");
		String str2=s2.replace(" ", "");
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("It's Anagram");
		}
		else
		{
			System.out.println("Its not Anagram");
		}

	}

}
