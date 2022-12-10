public class Savings extends Account{
    // List properties specific to the savings
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize setting for savings
    public Savings(String name, String SSN,double initDeposit){
        super(name, SSN,initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
        // System.out.println("Account Number " + this.accountNumber);
        // System.out.println("New Savings Account");
        // System.out.println(name);
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods specific to savings account
    public void showInfo(){
        // System.out.println("Account type: Savings");
        super.showInfo();
        System.out.println(
                "Savings Account Features" +
                        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                        "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );

    }
}
