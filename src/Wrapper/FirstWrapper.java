package Wrapper;



public class FirstWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int i= Integer.parseInt("10");
		System.out.println("i");
		
		boolean b=Boolean.parseBoolean("false");
		System.out.println(b);
		
		double d=Double.parseDouble("34.56");
		
		System.out.println(d);*/
		
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		int k=Integer.parseInt("100",2);
		System.out.println(k);
		
		System.out.println("Commmand Line Arguments");
		System.out.println(i+j);
		
		
		

	}

}
