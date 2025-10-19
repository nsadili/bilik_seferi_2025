package generics;

public class Account implements Comparable<Account> {
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
}
