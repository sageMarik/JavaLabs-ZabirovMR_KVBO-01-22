public class EmailTest {
    public static void main(String[] args) {
        String[] validEmails = {"user@example.com", "root@localhost"};
        String[] invalidEmails = {"myhost@@@com.ru", "@my.ru", "Julia String"};

        for (String email : validEmails) {
            System.out.println(email + " is valid: " + EmailValidator.isValidEmail(email));
        }

        for (String email : invalidEmails) {
            System.out.println(email + " is valid: " + EmailValidator.isValidEmail(email));
        }
    }
}
