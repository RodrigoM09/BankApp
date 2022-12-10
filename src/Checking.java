public class Checking extends Account{
    //Properties specific to Checking
    int debitCardNumber;
    int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name,String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
        // System.out.println("Account Number " + this.accountNumber);
        // System.out.println("New Checking Account");
        // System.out.println("Name: " + name);
    }
    // list any methods specific to the checking account

    public void showInfo(){
        super.showInfo();
        System.out.println("Account type: Checking");
    }

}
