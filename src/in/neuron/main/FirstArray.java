package in.neuron.main;

import java.util.Scanner;

class FirstArray
{
	public static void main(String[] args)
	{
		int ar[]=new int[5];
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter First Student Mark "+i);
			ar[i]=scanner.nextInt();
		}
		System.out.println("The Marks of Student as follows");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+" ");
		}
		
	}
}