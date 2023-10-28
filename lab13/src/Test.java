public class Test {
    public static void main(String[] args) {
        String phoneNumber1 = "+79512996240";
        String phoneNumber2 = "+10428965221";
        String phoneNumber3 = "89512996240";

        String formatted1 = PhoneNumberFormatter.formatPhoneNumber(phoneNumber1);
        String formatted2 = PhoneNumberFormatter.formatPhoneNumber(phoneNumber2);
        String formatted3 = PhoneNumberFormatter.formatPhoneNumber(phoneNumber3);

        System.out.println(formatted1);  // Ожидаемый результат: +7-917-5655-655
        System.out.println(formatted2);  // Ожидаемый результат: +1-042-8965-2211
        System.out.println(formatted3);  // Ожидаемый результат: +7-917-5655-655
    }
}
