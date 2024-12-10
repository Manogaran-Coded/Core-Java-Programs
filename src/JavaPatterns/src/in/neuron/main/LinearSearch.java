package in.neuron.main;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar= {10,20,30,40,50,60};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Key to find::");
		int key=scan.nextInt();
		
		boolean flag=false;
		
		for (int i=0;i<ar.length;i++)
		{
			
			if(key==ar[i])
			{
				System.out.println("Key Found :: " +ar[i]);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Key Not Found");
		}
		
	}

}
