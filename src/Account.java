public abstract class Account implements InterestRate{
    // List common properties for savings and checking account
        private String name;
        private String SSN;
        private double balance;

        private static int index = 10000;
        protected String accountNumber;
        protected double rate;

    //Constructor to set base properties and initialize the account
    public Account(String name, String SSN,double initDeposit){
       this.name = name;
       this.SSN = SSN;
       balance = initDeposit;
      //  System.out.println("Name: " + name + " " + "SSN: " + SSN + " " + "Balance: $" + balance);

        //Set account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = SSN.substring(SSN.length()-2, SSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accruedInt = balance * (rate/100);
        balance = balance + accruedInt;
        System.out.println("Accrued Interest: $" + accruedInt);
        printBalance();
    }
    // list common methods
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }
    public void withDraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }
    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transferring $" + amount + "to " + toWhere);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is now: $" + balance);
    }
    public void showInfo(){
        System.out.println(
                "Name: " + name +
                        "\nAccount Number: " + accountNumber +
                        "\nBalance: " + balance +
                        "\nRate: " + rate + "%"
        );
    }


}
