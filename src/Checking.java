public class Checking extends Account{
    //Properties specific to Checking
    int debitCardNumber;
    int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name,String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate(){
        rate = getBaseRate() * .15;
    }

    // list any methods specific to the checking account
    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }


    public void showInfo(){
        super.showInfo();
        System.out.println("Your Checking Account Features" +
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card Pin " + debitCardPin
        );
    }

}
