
import java.util.Scanner;

class InvalidCustomerException extends Exception {
    public InvalidCustomerException(String msg) {
        // TODO Auto-generated constructor stub
        super(msg);
    }

}

class ATM {
    int userId = 37571;
    int password = 384889;
    int id;
    int pw;

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the User Id");
        id = scan.nextInt();
        System.out.println("Enter the Password");
        pw = scan.nextInt();
    }

    public void verify() throws InvalidCustomerException {
        if ((userId == id) && (password == pw)) {
            System.out.println("Take the Cash");
        } else {
            InvalidCustomerException ice = new InvalidCustomerException(
                    "Are you sure?is this CARD belongs to you? will give 3 more attempts?will call 911 after 3 failures?you are on Camera   ");
            System.out.println(ice.getMessage());
            throw ice;
            // System.out.println("Theft Alert calling 911");
        }
    }
}

class Bank {
    public void initiate() {
        ATM a = new ATM();
        try {
            a.input();
            a.verify();
        } catch (InvalidCustomerException e1) {
            try {
                a.input();
                a.verify();
            } catch (InvalidCustomerException e2) {

            }
            try {
                a.input();
                a.verify();
            } catch (InvalidCustomerException e3) {
                System.out.println("You Caught!!!Calling 911");
                System.exit(0);
            }
        }
    }
}

public class LaunchCE {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.initiate();
    }

}
