public class ProcessStrings implements StringManipulator {


    public static void main(String[] args) {
        ProcessStrings processStrings = new ProcessStrings();

        String inputString = "Забиров Марат Рушанович КВБО-01-22";

        int charCount = processStrings.countCharacters(inputString);
        System.out.println("Количество символов: " + charCount);

        String oddPositionChars = processStrings.getOddPositionCharacters(inputString);
        System.out.println("Символы на нечетных позициях: " + oddPositionChars);

        String reversedString = processStrings.reverseString(inputString);
        System.out.println("Инвертированная строка: " + reversedString);
    }
}
