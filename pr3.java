//THIS PROGRAM PREPARED BY HARSH DUDHAT 21CE026
// // Use the Account class created in Programming Exercise 1 to simulate an ATM
// // machine.
// //  Create 10 accounts in an array with id 0, 1, . . . , 9, and an initial balance of
// // $100.
// //  The system prompts the user to enter an id. If the id is entered incorrectly, ask
// // the user to enter a correct id.
// //  Once an id is accepted, the main menu is displayed.
// //  You can enter choice 1 for viewing the current balance, 2 for withdrawing
// // money, 3 for depositing money, and 4 for exiting the main menu.
// //  Once the system starts, it will stop by entering number 99.
// import java.util.*;
// // import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

class Account_1 {
    double balance = 100;
    int[] Acco = new int[10];

    void data() {
        System.out.println();
        System.out.println("1.Deposit");
        System.out.println("2.Widthdraw");
        System.out.println("3.GetMonthlyInterestRate");
        System.out.println();
    }
}

class pr3 {
    public static void main(String[] args) {
        Account_1 a = new Account_1();
        Account ac = new Account();
        try (Scanner sc = new Scanner(System.in)) {
            int i;
            for (i = 0; i < a.Acco.length; i++) {
                a.Acco[i] = i;
            }
            System.out.println("Enter Your Account Number :  ");
            int k = sc.nextInt();
            if (k != a.Acco[i]) {
                System.out.println("Please Enter A Valid ID*");
            } else {
                System.out.println("*******Welcome To A.R.INTELLIGENCE BANK******");
                System.out.println();
                System.out.println("The Account Creation Date is : ");
                System.out.println(ac.date.toString());
                System.out.println();
                a.data();
                for (int j = 1; j >= 1; j++) {
                    System.out.println("Enter Your Input : ");
                    int m = sc.nextInt();
                    switch (m) {
                        case 1:
                            ac.deposit();
                            a.data();
                            continue;
                        case 2:
                            ac.withdraw();
                            a.data();
                            continue;
                        case 3:
                            ac.getMonthlyInterestRate();
                            a.data();
                            continue;
                            case 99:
                            break;
                        default:
                            System.out.println(":: 404 The Error Accurs ::");

                    }
                }
            }
            // sc.close();
        }
    }
}