import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceExtractor {
    public static void main(String[] args) {
        String text = "44 ERR, 25.98 USD, 200 BYN, 150 EUR, 75.25 RUB, 100 EUR";

        Pattern pattern = Pattern.compile("\\d+(\\.\\d{2})?\\s?(USD|RUB|EUR)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
