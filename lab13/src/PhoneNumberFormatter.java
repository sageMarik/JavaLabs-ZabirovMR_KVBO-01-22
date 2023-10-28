public class PhoneNumberFormatter {

    public static String formatPhoneNumber(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        // Убираем все нецифровые символы из входной строки
        String digitsOnly = input.replaceAll("[^0-9]", "");

        // Если номер начинается с "8", добавляем код страны России
        if (digitsOnly.startsWith("8")) {
            digitsOnly = "7" + digitsOnly.substring(1);
        }

        // Проверяем, что получившаяся строка имеет правильную длину
        if (digitsOnly.length() != 11) {
            return "Некорректный формат номера";
        }

        // Форматируем номер в требуемый формат
        String formattedNumber = "+" + digitsOnly.substring(0, 1) + digitsOnly.substring(1, 4)
                + "-" + digitsOnly.substring(4, 7) + "-" + digitsOnly.substring(7);

        return formattedNumber;
    }
}