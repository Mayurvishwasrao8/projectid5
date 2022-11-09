
import javax.swing.table.AbstractTableModel;
import java.util.Scanner;
public class MainApp12 {
    static Scanner sc = new Scanner(System.in);

    static {
        System.out.println("SELECT LANGUAGE: \n 1.english\n 2.hindi\n");
        int ch = sc.nextInt();
        if (ch == 1)
            System.out.println("LANGUAGE SELECTED IS ENGLISH!!");
        else
            System.out.println("LANGUAGE SELECTED IS HINDI!!");

    }

    static {
        System.out.println("ENTER PIN");
        int pin = sc.nextInt();
        if (pin == 1234)
            System.out.println("LOGIN SUCESSFULL!!");
        else {
            System.out.println("INVALID PIN");
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        System.out.println("--------------------------------------------------------");
        System.out.println("1.WITHDRAWL\n2.BALANCE");
        int ch = sc.nextInt();
        System.out.println("---------------------------------------------------------");
        ATM a1 = new ATM();
        if (ch == 1) {
            System.out.println("ENTER THE AMOUNT");
            double amt = sc.nextDouble();
            a1.cashWithdrawl(amt);
            System.out.println("---------------------------------------------------------");
        } else if(ch==2){
            System.out.println("Balance  is " + ATM.accountBalance);
        } else
            System.out.println("INVALID STATEMENT");
    }
}
    class ATM {
        static double accountBalance = 1000;

        public void cashWithdrawl(double amt) {
            if (amt <= accountBalance) {
                accountBalance -= amt;
                System.out.println("TAKE THE CASH");
            } else {
                System.out.println("INSUFFICIANT BALANCE !!");
            }
            displayBalance();
        }

        public void displayBalance() {
            System.out.println("ACCOUNT BALANCE:" + accountBalance);
        }
    }



