public class BankAccount {

    private int sortCode;
    private int accountNumber;

    public BankAccount(int sortCode, int accountNumber)
    {
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;

    }

    public String toString()
    {
        return "This bankaccount has sortcode : " + sortCode + " Account number : " + accountNumber;
    }

    public int getSortCode()
    {
        return sortCode;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public boolean equals ( Object obj ) {

        if ( this == obj ) {
            return true ;
        }

        if ( obj == null ) {
            return false ;
        }

        if ( obj . getClass () != this . getClass ())
        {
            return false ;
        }

        BankAccount other = ( BankAccount ) obj ;
        if(other.getSortCode() == this.sortCode && other.getAccountNumber() == this.accountNumber)
            return true;
        else
            return false;
    }

    public int hashCode()
    {
        int x = 1;
        x = x * 11 + sortCode;
        x = x * 13 + accountNumber;

        return x;
    }

}