import java.util.LinkedList;
import java.util.List;

public class BankApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();



        /*
        Checking check1 = new Checking("Rodrigo Marquez","32145679",1500);
        Savings Save1 = new Savings("David Cruz","456789012",2500);
        check1.showInfo();
        System.out.println("*****************");
        Save1.showInfo();
        Save1.compound();
         */

        // Read a CSV File to create new accounts based on data
        String file = "/Users/rodrigomarquez/IdeaProjects/BankApp/src/NewBankAccounts.csv";
        List<String[]> newAccounts = utilities.CSV.read(file);
        for (String[] account : newAccounts) {
            String name = account[0];
            String SSN = account[1];
            String accountType = account[2];
            double initDeposit = Double.parseDouble(account[3]);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, SSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, SSN, initDeposit));

            } else {
                System.out.println("Error reading account type");
            }
        }
        for (Account acc : accounts) {
            System.out.println("\n***************");
            acc.showInfo();
        }
    }
}