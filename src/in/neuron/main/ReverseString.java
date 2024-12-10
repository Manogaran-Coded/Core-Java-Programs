package in.neuron.main;

import java.util.Spliterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="iNeuron";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("Reverse of String:: "+s2);
		
		String str1="ineuron java";
		String s3="";
		String str2[]=str1.split(" ");
		for(String elem:str2)
		{
			
		
			for(int j=elem.length()-1;j>=0;j--)
			{
			s3=s3+elem.charAt(j);
			}
			s3=s3+" ";
		}
		System.out.println("Reverse String:: "+s3);
		
		
		String str4="ineuron java";
		String s4="";
		String s5="";
		String str5[]=str4.split(" ");
		for(int k=str5.length-1;k>=0;k--)
			
		{
			
	
			s4=s4+str5[k] + " ";
		
			
		}
		for (int j=str4.length()-1;j>=0;j--)
		{
			s5=s5+str4.charAt(j);
		}
		
		System.out.println("Original String:: "+str4);
		System.out.println("Reverse String:: "+s4);
		System.out.println("Reverse String:: "+s5);
		
	
		
		
	}

}
