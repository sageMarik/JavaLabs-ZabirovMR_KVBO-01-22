public interface StringManipulator {
    default int countCharacters(String s) {
        return s.length();
    }

    default String getOddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    default String reverseString(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }
}