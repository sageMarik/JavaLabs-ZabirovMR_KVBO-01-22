public class PasswordTest {
    public static void main(String[] args) {
        String[] validPasswords = {"F032_Password", "TrySpy1222"};
        String[] invalidPasswords = {"smart_pass", "A007", "TrySpy1"};

        for (String password : validPasswords) {
            System.out.println(password + " is a strong password: " + PasswordValidator.isStrongPassword(password));
        }

        for (String password : invalidPasswords) {
            System.out.println(password + " is a strong password: " + PasswordValidator.isStrongPassword(password));
        }
    }
}
