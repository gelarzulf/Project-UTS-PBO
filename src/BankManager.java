import java.util.Scanner;

public class BankManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new SavingsAccount(1000, 5);

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Add Interest");
            System.out.println("5. Exit");
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 4:
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).addInterest();
                    } else {
                        System.out.println("Interest feature not available.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please enter a valid option.");
            }
        }
    }
}
