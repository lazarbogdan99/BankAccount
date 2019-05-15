import java.util.HashSet;

public class Main {

    public static void main(String[] args){
        HashSet <BankAccount> bankAccount = new HashSet<>();

        BankAccount xd1 = new BankAccount(165000,321000);
        BankAccount xd2 = new BankAccount(405000,555000);
        BankAccount xd3 = new BankAccount (165000,321000);

        bankAccount.add(new BankAccount(165000,321000));
        bankAccount.add(new BankAccount(405000,555000));
        bankAccount.add(new BankAccount(165000,321000));

        for (BankAccount account : bankAccount )

        {
            System.out.println("This account has the sortcode: " + account.getSortCode() +" this account has the AccountNumber: " + account.getAccountNumber());
        }

        System.out.println(xd1.equals(xd2));
        System.out.println(xd1.equals(xd3));
        System.out.println(xd2.equals(xd3));

        System.out.println(xd1.hashCode());
        System.out.println(xd2.hashCode());
        System.out.println(xd3.hashCode());
    }

}