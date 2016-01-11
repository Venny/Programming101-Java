package week06.Friday.BankAccount;

/**
 * Created by inspired on 08.01.16.
 */
public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private final String PIN;

    public Person(String firstName, String lastName, int age, String PIN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.PIN = PIN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPIN() {
        return PIN;
    }
}
