package in.neuron.main;

public class LaunchPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Mano";
		String s2="";
		for (int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}

	}

}
