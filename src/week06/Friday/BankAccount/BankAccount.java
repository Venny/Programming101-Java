package week06.Friday.BankAccount;

/**
 * Created by inspired on 08.01.16.
 */
public class BankAccount {
    private int id;
    private double balance;
    private double interest;
    private String interestTpe;
    private Person person;

    public BankAccount(double balance, double interest, Person person){
        this.id = id;
        this.balance = balance;
        this.interest = interest;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String getInterestTpe() {
        return interestTpe;
    }

    public void setInterestTpe(String interestTpe) {
        this.interestTpe = interestTpe;
    }
}
