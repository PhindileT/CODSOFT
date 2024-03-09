package ac.za.atm;
import ac.za.bankaccount.BankAccount;
import javax.swing.JOptionPane;





/**
 *
 * @author phind
 */
public class ATM {

    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        String menu = "Welcome to the ATM!\n"
                + "1. Check Balance\n"
                + "2. Deposit\n"
                + "3. Withdraw\n"
                + "4. Exit";
        JOptionPane.showMessageDialog(null, menu);
    }

    public void checkBalance() {
        String message = "Your balance is: R" + account.getBalance();
        JOptionPane.showMessageDialog(null, message);
    }

    public void deposit() {
        String amountString = JOptionPane.showInputDialog("Enter amount to deposit:");
        double amount = Double.parseDouble(amountString);
        account.deposit(amount);
        JOptionPane.showMessageDialog(null, "Deposit successful!");
    }

    public void withdraw() {
        String amountString = JOptionPane.showInputDialog("Enter amount to withdraw:");
        double amount = Double.parseDouble(amountString);
        if (account.withdraw(amount)) {
            JOptionPane.showMessageDialog(null, "Withdrawal successful!");
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient funds!");
        }

    }
    
    public void run() {
        int choice;
        do {
            displayMenu();
            String choiceString = JOptionPane.showInputDialog("Enter your choice:");
            choice = Integer.parseInt(choiceString);
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
    }
}
