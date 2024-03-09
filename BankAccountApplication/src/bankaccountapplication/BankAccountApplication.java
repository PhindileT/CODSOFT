
package bankaccountapplication;

import ac.za.atm.ATM;
import ac.za.bankaccount.BankAccount;


public class BankAccountApplication {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount account = new BankAccount(1000.0); // Initial balance is R1000
        ATM atm = new ATM(account);
        atm.run();
    }
    
}
