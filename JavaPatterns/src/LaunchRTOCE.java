import java.util.Scanner;

class UnderAgeException extends Exception {
    public UnderAgeException(String msg) {
        super(msg);
    }

}

class OverAgeException extends Exception {
    public OverAgeException(String msg) {
        super(msg);
    }
}

class Applicant {
    int age;
    Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.println("Enter Your Age:: ");
        age = scan.nextInt();
    }

    public void verify() throws UnderAgeException, OverAgeException {
        if (age < 18) {
            UnderAgeException uae = new UnderAgeException("You are Still a Kid, Please apply Next Year!!!");
            // System.out.println("Please Try next Year");
            System.out.println(uae.getMessage());
            throw uae;
        } else if (age > 60) {
            // System.out.println("Sorry Sir, you Crossed your age Limit. Please keep a
            // driver and relax");

            OverAgeException oae = new OverAgeException(
                    "Sorry Sir, You Crossed your age Limit. Please keep a Drive and enjoy your Rest of Your Life");
            System.out.println(oae.getMessage());
            throw oae;
        } else {
            System.out.println("You are Eligible for Driving License");
        }
    }
}

class RTO {
    Applicant a = new Applicant();

    public void initiate() {
        try {

            a.input();
            a.verify();
        } catch (UnderAgeException | OverAgeException e2) {
            try {

                a.input();
                a.verify();
            } catch (UnderAgeException | OverAgeException e3) {
                try {

                    a.input();
                    a.verify();
                } catch (UnderAgeException | OverAgeException e4) {
                    System.out.println("Dont Ever Try again, Please read the rules carefully");
                    System.exit(0);
                }
            }
        }

    }
}

public class LaunchRTOCE {
    public static void main(String[] args) {
        RTO rto = new RTO();
        rto.initiate();
    }

}
