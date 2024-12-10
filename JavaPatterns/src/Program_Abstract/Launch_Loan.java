package Program_Abstract;

abstract class InterestRate{
	abstract void displayInterest();
}

class HomeLoan extends InterestRate{
	
	public void welcome() {
		System.out.println("Welcome to ABC Bank for Home Loan");
	}
	
	public void displayInterest()
	{
		System.out.println("Home Loan RI is 12%");
	}
	
}

class EducationLoan extends InterestRate{
	public void displayInterest()
	{
		System.out.println("Education Loan RI is 10%");
	}
	
	public void welcome() {
		System.out.println("Welcome to ABC Bank for Education Loan");
	}
}

public class Launch_Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeLoan hl=new HomeLoan();
		hl.welcome();
		InterestRate ir=new EducationLoan();
		ir.displayInterest();
		EducationLoan el=new EducationLoan();
		el.welcome();
		InterestRate ir1=new HomeLoan();
		ir1.displayInterest();
		
	}

}
