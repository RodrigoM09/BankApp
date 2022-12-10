import java.util.List;

public class BankApp {
    public static void main(String[] args) {
        String file = "/Users/rodrigomarquez/IdeaProjects/BankApp/src/NewBankAccounts.csv";
        // Auto generated method stud

        /*
        Checking check1 = new Checking("Rodrigo Marquez","32145679",1500);
        Savings Save1 = new Savings("David Cruz","456789012",2500);
        check1.showInfo();
        System.out.println("*****************");
        Save1.showInfo();
        Save1.compound();
         */

        // Read a CSV File to create new accounts based on data
        List<String[]> newAccounts = utilities.CSV.read(file);
        for (String[] account : newAccounts){
            String name = account[0];
            String SSN = account[1];
            String accountType = account[2];
            double initDeposit = Double.parseDouble(account[3]);
            System.out.println(name + " " + SSN + " " + accountType + " " + initDeposit);
            if (accountType.equals("Savings")){
                System.out.println("Open a Savings account");
            } else if(accountType.equals("Checking")) {
                System.out.println("Open a Checking account");
            } else {
                System.out.println("Error reading account type");
            }
        }
    }
}