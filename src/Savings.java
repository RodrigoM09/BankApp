public class Savings extends Account{
    // List properties specific to the savings
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize setting for savings
    public Savings(String name, String SSN,double initDeposit){
        super(name, SSN,initDeposit);
        accountNumber = "1" + accountNumber;
        System.out.println("Account Number " + this.accountNumber);
        System.out.println("New Savings Account");
        // System.out.println(name);
    }    // List any methods specific to savings account


}
