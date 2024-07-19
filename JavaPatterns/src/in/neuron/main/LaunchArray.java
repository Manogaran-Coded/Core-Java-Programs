package in.neuron.main;

import java.util.*;
class LaunchArray
{
	public static void main(String[] args) 
		
	{
		Scanner scan=new Scanner(System.in);
		int [][]ar=new int[3][4];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				//System.out.println(ar[i].length);
				System.out.println("Enter marks of Class "+i  + " Student " +j);
				ar[i][j]=scan.nextInt();
			}
		}
		System.out.println("The Marks of Students are");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++) {
				System.out.println(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}