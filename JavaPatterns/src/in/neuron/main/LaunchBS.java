package in.neuron.main;

public class LaunchBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,5,4,2,3,1,6};
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int tempVar=a[j];
					a[j]=a[j-1];
					a[j-1]=tempVar;
				}
			}
		}
		for(int ele:a)
		{
			System.out.println(ele);
		}
	}

}
