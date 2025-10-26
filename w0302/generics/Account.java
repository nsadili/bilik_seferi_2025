package generics;

public class Account extends Object implements Comparable<Account> {
    String firstname;
    String lastname;
    Double balance;

    public Account(String firstname, String lastname, Double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [firstname=" + firstname + ", lastname=" + lastname + ", balance=" + balance + "]";
    }

    @Override
    public int compareTo(Account o) {
        var diffBal = this.balance.compareTo(o.balance);
        if (diffBal != 0)
            return diffBal;

        var diffFirst = this.firstname.compareTo(o.firstname);
        if (diffFirst != 0)
            return diffFirst;

        return this.lastname.compareTo(o.lastname);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    
}
