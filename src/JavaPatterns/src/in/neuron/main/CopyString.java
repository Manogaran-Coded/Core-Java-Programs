package in.neuron.main;

public class CopyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Hello World");
		String s2=new String();
		for (int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("Copy of String S2 is  "+s2);
	}

}
