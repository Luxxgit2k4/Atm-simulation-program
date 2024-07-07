import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int ACCOUNT_BALANCE = 10000;
        int WITHDRAW, DEPOSIT;
        String i = "ATM";
        String j = "ATM";
        Scanner atm = new Scanner(System.in);
        while (j.equals(i)) {
            System.out.println("Welcome to ATM, Have a GOOD DAY !!");
            System.out.println("Kindly choose any of the following options");
            System.out.println("1. Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("3. Balance enquiry");
            System.out.println("4. Exit");
            int option = atm.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the amount to withdraw");
                    WITHDRAW = atm.nextInt();
                    if (WITHDRAW > ACCOUNT_BALANCE) {
                        System.out.println("Insufficient Balance");
                    } else {
                        ACCOUNT_BALANCE = ACCOUNT_BALANCE - WITHDRAW;
                        System.out.println("Remaining balance is " + ACCOUNT_BALANCE);
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit");
                    DEPOSIT = atm.nextInt();
                    ACCOUNT_BALANCE = DEPOSIT + ACCOUNT_BALANCE;
                    System.out.println("Your money has been deposited successfully");
                    System.out.println("Total balance is " + ACCOUNT_BALANCE);
                    break;
                case 3:
                    System.out.println("Your current balance is " + ACCOUNT_BALANCE);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
                    
            }
        }
    }
}
