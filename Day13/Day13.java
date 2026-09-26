import java.util.*;

class bankaccount {

    Scanner s = new Scanner(System.in);

    String n;
    int a;
    String w;

    public void details() {

        System.out.println("Enter your name");
        n = s.nextLine();

        System.out.println("Enter your Account Number");
        a = s.nextInt();
        s.nextLine();

        System.out.println("Do you want to withdraw or deposit");
        w = s.nextLine();
    }
}

class Accdetails extends bankaccount {

    public void baldetails() {

        if (w.equals("withdraw")) {

            System.out.println("Enter withdrawal amount");
            int wa = s.nextInt();

            System.out.println("Acc name: " + n);
            System.out.println("Acc number: " + a);
            System.out.println("Amount: " + w);
            System.out.println("Withdrawal: " + wa);

        } else {

            System.out.println("Enter deposit amount");
            int da = s.nextInt();

            System.out.println("Acc name: " + n);
            System.out.println("Acc number: " + a);
            System.out.println("Amount: " + w);
            System.out.println("Deposit: " + da);
        }
    }
}

class Day13 extends Accdetails {

    public static void main(String[] args) {

        Day13 v = new Day13();

        v.details();
        v.baldetails();
    }
}