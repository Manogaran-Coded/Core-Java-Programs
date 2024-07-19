package in.neuron.main;

import java.util.Scanner;

class PracticeArray
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int ar[][]=new int[3][4];
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.println("Enter Marks of Class " +i + " Student  " +j);
				ar[i][j]=scan.nextInt();
			}
		}
		System.out.println("Please find below Student Marks");
		for (int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.println(" Marks of Class " +i + " Student  " +j + " -->" + ar[i][j] );
			}
			System.out.println(" ");
			
		}
	}
}