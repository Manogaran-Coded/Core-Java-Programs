package in.neuron.main;

import java.util.Scanner;

class GPattern
{
	 public static void main(String[] args)
	    {
	        System.out.println("Enter the number of rows");
	        Scanner scan=new Scanner(System.in);
	        int n=scan.nextInt();
	        for (int i=0;i<n ;i++ )
	        {
	            for (int j=0;j<=n ;j++ )
	            {
	                if(i==0&&j>0&&j<3*n/4||j==0&&i<n-1&&i>0||i==(n-1)/2&&j>=(n-1)/2&&j<=(3*n)/4
	                		||j==(3*n)/4&&i>=(n-1)/2||i==n-1&&j<(n-1)/2||j==(n-1)/2&&i>=(n-1)/2)
	                {
	                    System.out.print("*");
	                }
	                else
	                {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}