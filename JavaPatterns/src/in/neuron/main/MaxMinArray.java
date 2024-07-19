package in.neuron.main;

public class MaxMinArray {
	public static void main(String []args) {
		int [] ar= {50,30,60,90};
		int max=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max)
			max=ar[i];
			
		}
		System.out.println("Maximum number is"+max);
		
		int min=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<min)
			{
				min=ar[i];
			}
			
		}
		System.out.println("Minimum number is "+min);
	}

}
