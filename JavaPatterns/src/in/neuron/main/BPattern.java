package in.neuron.main;

import java.util.Scanner;

class BPattern
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
	                //if (i==0&&j!=n/2||j==0||j==n/2&&i!=0&&i!=n/2&&i!=n-1||i==n/2&&j!=n/2||i==n-1&&j!=n/2)
	            	if((i==0&&j<(n-1)/2)||(i==(n-1)/2&&j<(n-1)/2)||
	            	(i==n-1&&j<(n-1)/2)||(j==(n-1)/2&&i!=0&&i!=(n-1)/2&&i!=n-1)||j==0)
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