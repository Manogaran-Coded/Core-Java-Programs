package in.neuron.main;
class FirstProject
{
	public static void main(String [] args)
	{
		int n=13;
		for(int i=0;i<n;i++) 
		{
			
				for(int j=0;j<n;j++)
				{
					//if(i==0||i==n-1||j==0||j==n-1)
					if(i==0||j==0||(i==n/2&&j==0))
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