package week06.Friday.BankAccount;

/**
 * Created by inspired on 08.01.16.
 */
public class UserInputChecker extends Exception {
    public interface Validator{
        public boolean validate(String input);
    }

    public class PersonNameValidator implements Validator {
        @Override
        public boolean validate(String input) {
            return false;
        }
    }

}
